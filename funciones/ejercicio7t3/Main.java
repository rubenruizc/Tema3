package ejercicio7t3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		boolean primo;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		numero = sc.nextInt();
		
		primo = EsPrimo.esPrimo(numero);
		
		if(primo) {
			System.out.println("Su número es primo");
			
		} else {
			System.out.println("Su número no es primo");
		}
		sc.close();			
	}

}
