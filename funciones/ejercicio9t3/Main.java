package ejercicio9t3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double numero1;
		
		double numero2;
		
		int opcion;
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Escriba un número: ");
			numero1 = sc.nextDouble();

			System.out.println("Escriba otro número: ");
			numero2 = sc.nextDouble();

			System.out.println("¿Que quiere hacer con ese número?");
			System.out.println("1.SUMA 2.RESTA 3.MULTIPLICACIÓN 4.DIVISIÓN");
			opcion = sc.nextInt();
			
			if (numero2 == 0 && opcion == 4) {
				System.out.println("ERROR");
				
			} else {
				if (opcion == 1) {
					System.out.print("La suma de sus dos números es: ");
					
				} else if (opcion == 2) {
					System.out.print("La resta de sus dos número es: ");
					
				} else if (opcion == 3) {
					System.out.print("La multiplicación de sus dos números es: ");
					
				} else {
					System.out.print("La división de sus dos números es: ");
				
				}

				System.out.print(Calculadora.calculadora(opcion, numero1, numero2));
	
			}
			
		} catch (InputMismatchException e) {
			System.out.println("VALOR MAL INTRODUCIDO");
			sc.nextLine();
		}
		
		sc.close();
	}

}
