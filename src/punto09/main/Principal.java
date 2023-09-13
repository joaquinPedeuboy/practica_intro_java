package punto09.main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indique la cantidad de numeros a mostrar");
		int cantidad = scanner.nextInt();
		
		System.out.println("Indica si quieres que sean pares o impares con un true o false");
		boolean isPar = scanner.nextBoolean();
		int number = isPar ? 2 : 1;
		
		for(int i = 1; i<=cantidad; i++) {
			System.out.println(number);
			number += 2;
		}
	
		scanner.close();
	}
}
