
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        /*System.out.println("Qual foi a nota do aluno? ");
        double nota = entrada.nextDouble();
        if (nota >= 7 && nota <= 10) {
            System.out.println("O aluno esta aprovado !!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("O aluno esta de recuperação");
        } else 
            System.out.println("O aluno esta reprovado");*/

        Scanner entrada = new Scanner(System.in);
        //Estrutura com Condição Ternaria

            System.out.println("Digite a nota do aluno: ");
            double nota = entrada.nextDouble();

            String resultado = nota >= 7 && nota <= 10 ? "O aluno esta aprovado" : "O aluno esta reprovado";

            System.out.println(resultado);
        entrada.close();
    }
}
