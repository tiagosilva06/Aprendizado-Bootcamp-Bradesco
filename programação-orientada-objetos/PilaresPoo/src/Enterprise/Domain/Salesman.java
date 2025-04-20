
package Enterprise.Domain;
//non-sealed --> para a Classe Pai poder seleciona-la

public non-sealed class Salesman extends Employee {
	
	protected double percentPerSold;
	protected String login;
	protected String password;
	
	@Override
	public String getCode() {
		return "SL" + this.code;
	}

	public Salesman(String code, String name, String adress, int age, double salary, double percentPerSold) {
		super(code, name, adress, age, salary);
		this.percentPerSold = percentPerSold;
		
		// TODO Auto-generated constructor stub
	}
	
	public Salesman() {
		
	}
	
	public double getPercentPerSold() {
		return percentPerSold;
	}
	public void setPercentPerSold(double percentPerSold) {
		this.percentPerSold = percentPerSold;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}
