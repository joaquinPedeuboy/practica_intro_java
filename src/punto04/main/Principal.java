package punto04.main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese dos letras");
		String letra1 = scanner.next();
		String letra2 = scanner.next();
		char caracter1;
		char caracter2;
		int ascii1, ascii2;
		
		caracter1 = letra1.charAt(0);
		caracter2 = letra2.charAt(0);
		
		ascii1 = caracter1;
		ascii2 = caracter2;
		
		System.out.println("En ASCII: " + ascii1);
		System.out.println("En ASCII: " + ascii2);
		
		scanner.close();
	}
}
