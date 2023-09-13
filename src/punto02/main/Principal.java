package punto02.main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre y apellido: ");
		String nom = scanner.nextLine();
		
		String[] partes = nom.split(" ");
		
		if(partes.length == 2) {
			String nombre = partes[0];
			String apellido = partes[1];
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellido " + apellido);
			String iniciales = String.valueOf(nombre.charAt(0)).toUpperCase() + 
					String.valueOf(apellido.charAt(0)).toUpperCase();
			System.out.println("Iniciales en mayusculas: " + iniciales);
			
			String primeraLetraM = nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase();
			String primeraLetraMa = apellido.substring(0,1).toUpperCase() + apellido.substring(1).toLowerCase();
			System.out.println("Completo: ");
			System.out.println(String.join(" ",primeraLetraM,primeraLetraMa));
			
			
		}
		
		scanner.close();
		
		
	}
}
