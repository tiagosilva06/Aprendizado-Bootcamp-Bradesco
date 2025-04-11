package AplicativoMensagem;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorJoao {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "fcb"; 
		
			if (appEscolhido.equals("msn")) {
				smi = new MSNMessenger();
			} 
			else if (appEscolhido.equals("fcb")) {
				smi = new FacebookMessenger();
			}
			else if (appEscolhido.equals("tlg")) {
				smi  = new Telegram();
			}
			
			smi.enviarMensagem();
			smi.receberMensagem();	
		
	}
}
