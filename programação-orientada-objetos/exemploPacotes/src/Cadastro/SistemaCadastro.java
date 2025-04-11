package Cadastro;

public class SistemaCadastro {
	public static void main(String[] args) {
		//Criamos uma pessoa no sistemma
		Pessoa tiago = new Pessoa("Tiago da Silva Santos", "123.456.789-10");
		
		//definimos o endereço desta pessoa
		tiago.setEndereco("Rua das Marias");
		
		System.out.println(tiago.getNome() + " - " + tiago.getCpf());
	}
}
