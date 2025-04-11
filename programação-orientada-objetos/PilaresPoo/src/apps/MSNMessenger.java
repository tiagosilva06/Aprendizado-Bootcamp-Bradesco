package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo MSN Messenger");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}
	
}
