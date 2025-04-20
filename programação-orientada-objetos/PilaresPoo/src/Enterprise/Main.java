package Enterprise;

import Enterprise.Domain.Employee;
import Enterprise.Domain.Manager;
import Enterprise.Domain.Salesman;

public class Main {
	public static void main(String[] args) {
		printEmployee(new Manager());
		printEmployee(new Salesman());
		
	}
	
	public static void printEmployee (Employee employee) {
		
		System.out.printf("==== %s ====\n", employee.getClass().getCanonicalName());
		if (employee instanceof Manager) {
		    Manager manager = (Manager) employee;
		    
		    manager.setCode("55555");
		    manager.setName("Tiago da Silva Santos");
		    manager.setSalary(12000);
		    manager.setLogin("tiago.santos");
		    manager.setPassword("123456");
		    manager.setComission(1500);

		    System.out.println(manager.getCode());
		    System.out.println(manager.getName());
		    System.out.println(manager.getSalary());
		    System.out.println(manager.getLogin());
		    System.out.println(manager.getPassword());
		    System.out.println(manager.getComission());
		    
		} else if (employee instanceof Salesman) {
		    Salesman salesman = (Salesman) employee;
		    salesman.setCode("11111");
		    salesman.setName("Carlos Henrique Nogueira");
		    salesman.setSalary(8000);
		    salesman.setLogin("carlos.henrique");
		    salesman.setPassword("654321");
		    salesman.setPercentPerSold(10);

		    System.out.println(salesman.getCode());
		    System.out.println(salesman.getName());
		    System.out.println(salesman.getSalary());
		    System.out.println(salesman.getLogin());
		    System.out.println(salesman.getPassword());
		    System.out.println(salesman.getPercentPerSold());
		    
		}
		System.out.println("============================");
	}
}
