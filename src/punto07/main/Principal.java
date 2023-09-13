package punto07.main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String usuario = "Pepito";
		String clave = "1234";
		
		System.out.println("Ingrese su usuario");
		String usuarioIngresado = scanner.next();
		System.out.println("Ingrese su clave");
		String claveIngresada = scanner.next();
		
		if(usuarioIngresado.equals(usuario) && claveIngresada.equals(clave)) {
			System.out.println("Bienvenido Pepito!");
		}else if(usuarioIngresado.equals(usuario)) {
			System.out.println("Contraseña incorrecta");
		}else if(claveIngresada.equals(clave)) {
			System.out.println("Usuario Incorrecto");
		}else {
			System.out.println("Usuario y Contraseña incorrectos");
		}
		
		
		scanner.close();
	}

}
