package set.DesafioConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra (String palavra){
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra (String palavra){
        if (!palavrasUnicasSet.isEmpty()){
            if (palavrasUnicasSet.contains(palavra)){
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto de palavras");
            }
        } else{
            System.out.println("O conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        }else {
            System.out.println("O conjunto está vázio");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("PHP");
        conjuntoPalavrasUnicas.adicionarPalavra("Ruby");
        conjuntoPalavrasUnicas.adicionarPalavra("C#");

        System.out.print("exibindo o conjunto de palavras unicas = ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("PHP");
        System.out.print("exibindo o conjunto de palavras unicas = ");

        conjuntoPalavrasUnicas.removerPalavra("Swift");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Python"));
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
