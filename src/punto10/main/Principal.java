package punto10.main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int[] vec = {10,20,5,15,30,20};
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("MENU");
			System.out.println("1: Indice: X, Valor: Y");
			System.out.println("2: Sumar y mostar total");
			System.out.println("3: Contenido posiciones impares");
			System.out.println("4: Mayor valor almacenado");
			System.out.println("5: Informar cuantas veces aparece el 20");
			System.out.println("6: SALIR");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1: {
				for(int i=0;i<vec.length;i++) {
					System.out.println("Indice X: "+ i + " Valor Y: "+ vec[i] );
					System.out.println();
				}break;
			}
			case 2:{
				int suma = 0;
				for(int a:vec) {
					suma += a;
					
				}
				System.out.println(suma);
				System.out.println();
				break;
			}
			case 3:{
				informarPosicionesImparaes(vec);
				break;
			}
			case 4:{
				informarMayorValor(vec);
				break;
			}
			case 5:{
				contarOcurrencias(vec, 20);
				break;
			}
			case 6:{
				System.out.println("Saliendo del programa.");
				break;
			}
			default:
				System.out.println("Opcion no valida. Intente de nuevo");
				break;
			}
		} while (opcion!=6);
		scanner.close();
	}
	
	public static void informarMayorValor(int[] vec) {
		int maximo = Integer.MIN_VALUE;
		for(int num:vec) {
			if(num > maximo) {
				maximo=num;
			}
		}
		System.out.println("El mayor valor es: " + maximo);
	}
	
	public static void contarOcurrencias(int[] vec, int numero) {
		int contador =0;
		for( int num:vec) {
			if(num==numero) {
				contador++;
			}
		}
		System.out.println("El numero "+ numero + " aparece "+ contador + " veces.");
	}
	
	public static void informarPosicionesImparaes(int[]vec) {
		System.out.println("Posiciones Impares: ");
		for(int b=0; b<vec.length;b++) {
			if(vec[b]%2!=0) {
				System.out.println(b + " ");
			}
		}
		System.out.println();
	}
}
