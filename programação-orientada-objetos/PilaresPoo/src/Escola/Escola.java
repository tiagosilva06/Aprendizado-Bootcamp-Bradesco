package Escola;

public class Escola {
	public static void main(String[] args) {
		Aluno tiago = new Aluno();
		
		tiago.setNome("Tiago da Silva Santos");
		tiago.setIdade(18);
		
		System.out.println("O aluno " + tiago.getNome() + " tem " + tiago.getIdade() + " anos");
	}
}
