package punto03.main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese dos numeros");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		System.out.println("Ingrese la cantidades de decimales que desea ver");
		int decimales = scanner.nextInt();
		
		double potencia1 = Math.pow(num1, num1);
		double potencia2 = Math.pow(num2, num2);
		
		System.out.println(String.format("Elnumero es: %."+decimales+"f", potencia1));
		System.out.println(String.format("Elnumero es: %."+decimales+"f", potencia2));
		
		
		scanner.close();
	}
	
}
