public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 40.0;
        double valorSolicitado = 17.50;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Valor solicitado de saque: " + valorSolicitado);
            System.out.println("Saldo Atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para Saque!!");
        }

    }
}
