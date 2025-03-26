
import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

            System.out.println("Bem Vindo a sua Operadora");
            System.out.println("Tipo de Planos");
            System.out.println("- Basic");
            System.out.println("- Midia");
            System.out.println("- Turbo");    
            System.out.println("Escolha seu plano de operadora!! (B, M, T):");
            System.out.println("-----------------------------------------------");

            String plano = entrada.nextLine();
            System.out.println("Beneficios: ");
            switch (plano) {
                case "T": {
                    System.out.println("- 56 GB Youtube ");
                }
                case "M": {
                    System.out.println("- Whatsapp e Instagram Grátis");
                }
                case "B": {
                    System.out.println("- 100 minutos de ligação ");
                }
            }

        entrada.close();

    }
}
