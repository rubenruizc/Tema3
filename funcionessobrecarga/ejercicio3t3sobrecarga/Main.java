package ejercicio3t3sobrecarga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		Scanner sc = new Scanner (System.in);
		System.out.print("Escriba un número: ");
		numero1 = sc.nextInt();
		System.out.println("La suma desde el 1 a su número es: " + SumaEnteros.sumaEnteros(numero1));
		System.out.println();
		System.out.println("Escriba un número: ");
		numero1 = sc.nextInt();
		System.out.println("Escriba otro número: ");
		numero2 = sc.nextInt();
		System.out.println("La suma desde el 1 a sus números sumados es: " + SumaEnteros.sumaEnteros(numero1, numero2));
		sc.close();
	}

}
