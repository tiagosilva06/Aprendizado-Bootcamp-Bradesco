public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Tipos e variaveis");
        System.out.println("{byte} idade = 123");
        System.out.println("{short} ano = 2025");
        System.out.println("{int} cep = 0152810");
        System.out.println("{long} cpf = 58306435898L - L para especificar que é um long");
        System.out.println("{float} pi = 3.14F ");
        System.out.println("{double} salario = 1518.50");

        //Java é fortemente tipado
       
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // é possivel converter um short para um int MAS 
        // Não um int para um short - (apenas com o recurso cast)

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        // "final" - para n permitir mudanças na variavel



    }
}
