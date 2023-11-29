package ejercicio1t3sobrecarga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		double numero3;
		double numero4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero: ");
		numero1 = sc.nextInt();
		System.out.println("Escribe otro número entero: ");
		numero2 = sc.nextInt();
		System.out.println("Escribe un número real: ");
		numero3 = sc.nextDouble();
		System.out.println("Escribe otro número real: ");
		numero4 = sc.nextDouble();

		System.out.println("La suma de sus número enteros es: " + Suma.suma(numero1, numero2));

		System.out.println("La suma de sus números reales es: " + Suma.suma(numero3, numero4));
		
		sc.close();
	}

}
