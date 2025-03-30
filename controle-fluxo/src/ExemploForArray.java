public class ExemploForArray {
    public static void main(String[] args) {
        
        //Array - Conjunto de Elementos de um tipo correspondente
        //Em arrays os indices começam no 0
        
        String alunos[] = {"TIAGO", "DONNA", "CAUA", "JOAO"};

        for ( String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }

        /*for (int x = 0; x < alunos.length; x ++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }*/

    }
}
