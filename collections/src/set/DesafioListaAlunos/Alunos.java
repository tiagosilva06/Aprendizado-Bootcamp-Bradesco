package set.DesafioListaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos> {
    private String nome;
    private long matricula;
    private double media;

    public Alunos(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public int compareTo(Alunos o) {
        return nome.compareToIgnoreCase(o.getNome());
    }


    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome= '" + nome + '\'' +
                ", matricula= " + matricula +
                ", media= " + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return matricula == alunos.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

}

class ComparatorPorMedia implements Comparator<Alunos>{

    @Override
    public int compare(Alunos o1, Alunos o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}
