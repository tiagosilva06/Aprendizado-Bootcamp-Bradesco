
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

            System.out.println("Busque o tamanho (P, M, G): ");
            String sigla = entrada.nextLine();

            switch (sigla){
                case "P" : {
                    System.out.println("PEQUENO");
                    break;
                }
                case "M" : {
                    System.out.println("MÉDIO");
                    break;
                }
                case "G" : {
                    System.out.println("GRANDE");
                    break;
                } 
                default : {
                    System.out.println("Tente novamente com uma sigla válida");
                    break;
                } 
            }

        entrada.close();

    }
}
