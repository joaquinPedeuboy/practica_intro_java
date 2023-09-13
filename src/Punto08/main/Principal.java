package Punto08.main;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Elija la opcion con la que desea trabajar");
			System.out.println("1: FOR");
			System.out.println("2: DO-WHILE");
			System.out.println("3: WHILE");
			System.out.println("4: SALIR");
			opcion = scanner.nextInt();
			switch(opcion) {
			case 1:
				
				for(int i = 1; i<=10;i++) {
					System.out.print(i);
					if(i<10) {
						System.out.print(" - ");
					}
				}
				System.out.println();
				break;
			case 2:
				int i = 1;
				do {
					System.out.print(i);
					if(i<10) {
						System.out.print(" - ");
					}
					i++;
				}while(i<=10);
				System.out.println();
				break;
			case 3:
				int i1 = 1;
				while(i1<=10) {
					System.out.print(i1);
					if(i1<10) {
						System.out.print(" - ");
					}
					i1++;
					
				}
				System.out.println();
				break;
			case 4:
				System.out.println("Cierre del programa");
				break;
				
			default:
				System.out.println("La opcion no es correcta");
			
			}
		}while(opcion!=4);
		scanner.close();
	}
}
