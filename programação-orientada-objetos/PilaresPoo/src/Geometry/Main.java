package Geometry;

import java.util.Scanner;

public class Main {
	private static final Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int option;
		GeometricArea geometricArea = null;
		while (true) {
			System.out.println("Escolha a forma geometrica para calcular a área");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Retangulo");
			System.out.println("3 - Circulo");
			System.out.println("4 - Sair do programa");
			option = entrada.nextInt();
			
			if(option == 1) {
				geometricArea = createSquare();
			} else if (option == 2) {
				geometricArea = createRectangle();
			} else if (option == 3) {
				geometricArea = createCircle();
			} else if (option == 4) {
				System.out.println("Saindo do programa...");
				break;
			} else {
				System.out.println("Opção Invalida..");
				continue;
			}
			System.out.println("O resultado da conta é igual a " + geometricArea.getArea());
		}
	}
	
	private static GeometricArea createSquare() {
		System.out.println("Informe os lados:");
		double side = entrada.nextDouble();
		return new Square(side);
	}
	
	private static GeometricArea createRectangle() {
		System.out.println("Informe a base:");
		double base = entrada.nextDouble();
		
		System.out.println("Informe a altura:");
		double altura = entrada.nextDouble();
		return new Rectangle(base, altura);
	}
	
	private static GeometricArea createCircle() {
		System.out.println("Informe o raio:");
		double radius = entrada.nextDouble();
		return new Circle(radius);
	}
}
