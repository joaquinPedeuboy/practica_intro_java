package punto06.main;

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
		
		int negativos = 0;
		if(num1<0) {
			negativos++;
		}
		if(num2<0) {
			negativos++;
		}
		if(num3<0) {
			negativos++;
		}
		System.out.println("La cantidad de numeros negativos son: "+negativos);
		
		if(negativos ==  1) {
			int resultado = 1;
			if(num1>0) {
				resultado*=num1;
			}
			
			if(num2>0) {
				resultado*=num2;
			}
			
			if(num3>0) {
				resultado*=num3;
			}
			
			System.out.println("El resultado de la multiplicacion es: " + resultado);
		}else {
			System.out.println("Debe haber exactamente un numero negativo por lo menos");
		}
		
		scanner.close();
		
	}
}
