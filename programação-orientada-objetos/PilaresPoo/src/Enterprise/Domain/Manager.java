package Enterprise.Domain;
//non-sealed --> para a Classe Pai poder seleciona-la

public non-sealed class Manager extends Employee {
	protected String login;
	protected String password;
	protected double comission;
	
	@Override
	public String getCode() {
		return "MN" + this.code;
	}
	
	public Manager(String code, String name, String adress, int age, double salary, String login, String password, double comission) {
		super(code, name, adress, age, salary);
		this.login = login;
		this.password = password;
		this.comission = comission;	}
	
	public Manager() {
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public double getComission() {
		return comission;
	}
	public void setComission(double comission) {
		this.comission = comission;
	}
}

