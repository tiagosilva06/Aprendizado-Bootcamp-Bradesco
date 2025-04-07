package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		
		//Ações que não precisam estar disponiveis para todas a aplicação
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();
		
		//ações que o estabelecimento precisa ter ciencia
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//Ações que não precisam estar disponiveis para todas a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		
		//Ações que somente o seu pacote cozinha precisa conhecer(Default)
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();
		
		//Ações que somente o seu pacote cozinha precisa conhecer(Default)
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		/*Não deveria mas o estabelecimento ainda não definiu normas de atendimento*/
		cliente.pegarPedidoBalcão();
		
		//esta ação é muito sigilosa, que tal ser privada?
		cliente.consultarSaldoAplicativo();
		
		//já pensou os clientes ouvindo que o gás acabou?
		cozinheiro.pedirParaTrocarGas(almoxarife);
		cozinheiro.pedirParaTrocarGas(atendente);
	}

}
