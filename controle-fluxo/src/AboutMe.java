
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        

        //TRATANDO EXCEÇÕES EM JAVA 
        try {
            Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

                System.out.println("Digite seu nome: ");
                String nome = entrada.next();

                System.out.println("Digite seu sobrenome: ");
                String sobrenome = entrada.next();

                System.out.println("Digite sua idade: ");
                int idade = entrada.nextInt();

                System.out.println("Digite sua altura: ");
                double altura = entrada.nextDouble();

            //Imprimindo os dados obtidos pelos usuarios
                System.out.println("Ola me chamo " + nome + " " + sobrenome  );
                System.out.println("Tenho " + idade + " anos");
                System.out.println("Minha altura é " + altura + " cm");
            entrada.close();
        }
         catch (InputMismatchException e) {
            System.out.println("Os campos 'Idade' e 'Altura' precisam ser numericos. ");
        }

        }
}
