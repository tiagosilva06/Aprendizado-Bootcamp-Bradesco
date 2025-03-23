public class Operadores {
    public static void main(String[] args) {
        
        System.out.println("Alguns exemplos utilizando operadores..");
        System.out.println("---------------------------------------");

            int numero = 5;
            numero++;
            //numero = numero + 1;
            System.out.println(numero);
            boolean variavel = true;
            System.out.println(!variavel);

        System.out.println("----------------------");
        System.out.println("Operadores Ternarios");

            int a, b;
            a = 5;
            b = 3;
            //String result = " ";
            //if (a == b) {
            //    result = "true";
            //} else {
            //    result = "false";
            //}
            String result  = a == b ? "true" : "false";  
            System.out.println(result);
        
        System.out.println("----------------------");
        System.out.println("Operadores relacionais");

        //Para comparar Strings usar ".equals"
        //Para comparar numeros usar "=="

            String nomeUm = "Donna";
            String nomeDois = new String("Donna");
            System.out.println(nomeUm.equals(nomeDois));

            int num1 = 2;
            int num2 = 3;

            boolean simNao = num1 == num2;
            System.out.println("Numero 1 é igual ao numero 2 ?" + simNao );

            simNao = num1 != num2;
            System.out.println("Numero 1 é diferente do numero 2 ?" + simNao);

            simNao = num1 > num2;
            System.out.println("Numero 1 é maior que numero 2? " + simNao);

        System.out.println("------------------");
        System.out.println("Operadores Lógicos");

            boolean condicao1 = true;
            boolean condicao2 = true;

            if (condicao1 && (3 < 5)) {
                System.out.println("As duas condições são verdadeiras");
            }

            if (condicao1 || condicao2) {
                System.out.println("Uma das condições é verdadeira");
            }

        System.out.println("Fim do programa..");
    }
}
