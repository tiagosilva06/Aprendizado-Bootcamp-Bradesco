package MarketingMessages;

import java.util.Scanner;
public class Main {
	private static final Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int option;
		MessageSystem messageSystem = null;
		while(true) {
			System.out.println("=====================================");
			System.out.println("Por onde deseja abrir a mensagem?");
			System.out.println("1 - Whatsapp");
			System.out.println("2 - Instagram");
			System.out.println("3 - Email");
			System.out.println("4 - SMS");
			System.out.println("5 - Sair do celular..");
			System.out.println("=====================================");
			option = entrada.nextInt();
			
			if(option == 1) {
				messageSystem = createWhatsapp();
			} else if (option == 2) {
				messageSystem = createInstagram();
			} else if (option == 3) {
				messageSystem = createEmail();
			} else if (option == 4) {
				messageSystem = createSMS();
			} else if (option == 5) {
				System.out.println("Saindo do celular");
				break;
			} else {
				System.out.println("Opção Invalida. Tente novamente");
				continue;
			}
			System.out.println(messageSystem.getMessage());
		}
	}		
		private static MessageSystem createWhatsapp() {
			System.out.println("Abrindo mensagem..");
			String whats = entrada.nextLine();
			return new Whatsapp(whats);
		}
		private static MessageSystem createInstagram() {
			System.out.println("Abrindo mensagem..");
			String insta = entrada.nextLine();
			return new Instagram(insta);
		}
		private static MessageSystem createEmail() {
			System.out.println("Abrindo mensagem..");
			String email = entrada.nextLine();
			return new Email(email);
		}
		private static MessageSystem createSMS() {
			System.out.println("Abrindo mensagem..");
			String sms = entrada.nextLine();
			return new SMS(sms);
		}
}
