package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCÃO");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	
	private void prepararVitamina() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
	}
	
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA , LEITE E SUCO");
	}
	
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}
	
	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA HAMBURGUER");
	}
	
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	private void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	
	
}
