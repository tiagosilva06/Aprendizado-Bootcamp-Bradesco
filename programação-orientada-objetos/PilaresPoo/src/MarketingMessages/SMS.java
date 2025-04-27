package MarketingMessages;

public record SMS(String message) implements MessageSystem  {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Visualizando mensagem pelo SMS";
	}

}
