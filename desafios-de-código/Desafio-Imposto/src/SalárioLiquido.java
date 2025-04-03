
import java.util.Scanner;

public class SalárioLiquido {
    public static void main(String[] args) throws Exception {
    //Calculando o valor do salário a ser transferido a um funcionario.
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o valor bruto do salário do funcionário ? ");
            float salario = entrada.nextInt();

            System.out.println("Qual o valor dos beneficios do funcionário? ");
            float beneficios = entrada.nextInt();

            float valorImposto = 0;
            if (salario > 0 && salario <= 1518) {
                valorImposto = 0.05F * salario; 
            } else if (salario > 1518 && salario <= 3500) {
                valorImposto = 0.10F * salario;
            } else if (salario > 3500 && salario <= 10000) {
                valorImposto = 0.15F * salario;
            }

            float saida = salario + beneficios - valorImposto;
            System.out.printf("O funcionário receberá de forma liquida : %.2f", saida); 
    }
}
