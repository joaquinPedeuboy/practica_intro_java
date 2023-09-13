package punto05.main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese tres numeros");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		int mayor = num1;
		if(num2 > mayor) {
			mayor = num2;
		}
		
		if(num3 > mayor) {
			mayor = num2;
		}
		
		System.out.println("El numero mayor es: "+mayor);
		
		scanner.close();
	}
}
