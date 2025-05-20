package set.DesafioListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(String nome){
        Alunos alunoParaRemover = null;
        if(!alunosSet.isEmpty()){
            for(Alunos a : alunosSet){
                if(a.getNome().equalsIgnoreCase(nome)){
                    alunoParaRemover = a;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            System.out.println("A lista de alunos está vazia");
        }

        if(alunoParaRemover == null){
            System.out.println("Aluno não encontrado");
        }
    }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> alunoPorNome = new TreeSet<>(alunosSet);
        return alunoPorNome;
    }

    public Set<Alunos> exibirAlunosPorMedia(){
        Set<Alunos> alunoPorMedia = new TreeSet<>(new ComparatorPorMedia());
        alunoPorMedia.addAll(alunosSet);
        return alunoPorMedia;
    }

    public void exibirAlunos(){
        if(!alunosSet.isEmpty()){
            System.out.println(alunosSet);
        } else {
            System.out.println("A lista de alunos está vazia");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Tiago da Silva Santos", 1212, 9.5);
        alunos.adicionarAluno("Alexandre Miguel", 1234, 8.0);
        alunos.adicionarAluno("João Batista", 3210, 5.5);
        alunos.adicionarAluno("Guilherme Alves", 3210, 7.2);
        alunos.adicionarAluno("Marcelo Costa", 1111, 3.0);

        System.out.println("Exibindo Alunos com base na média:");
        System.out.println(alunos.exibirAlunosPorMedia());
        System.out.println("");

        System.out.println("Exibindo Alunos em ordem alfabetica:");
        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println("");

        System.out.println("Removendo do sistema aluno que foi expulso:");
        alunos.removerAluno("Marcelo Costa");
        alunos.exibirAlunos();
        System.out.println("");

        System.out.println("Adicionando aluno com matricula atualizada");
        alunos.adicionarAluno("Guilherme Alves", 8888, 7.2);
        alunos.exibirAlunos();
    }
}
