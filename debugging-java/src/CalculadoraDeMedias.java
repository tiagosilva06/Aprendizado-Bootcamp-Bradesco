import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        
        //Fazendo debugging para encontrar erros
        //substitui o double pelo Int - Int foi usado para testar o debug
        Scanner entrada = new Scanner(System.in);   
            String [] alunos = {"Donna", "Tiago", "Caua", "Lucas"};

            double media = calculaMediaDaTurma(alunos, entrada);

            System.out.printf("Media da turma %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno(a) %s ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}