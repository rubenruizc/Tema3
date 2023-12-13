package ejercicio2t3sobrecarga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("El ejercicio consiste en hacer la media de los números introducidos");
		Main.imprimir();
		Main.imprimir2();

	}

	public static void imprimir() {
		int numero1;
		int numero2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		numero1 = sc.nextInt();
		System.out.print("Escribe otro número: ");
		numero2 = sc.nextInt();
		System.out.println("La media de sus tres números es: " + Media.media(numero1, numero2));
		sc.close();
	}

	public static void imprimir2() {
		int numero1;
		int numero2;
		int numero3;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Escribe un número: ");
		numero1 = sc.nextInt();
		System.out.print("Escribe otro número: ");
		numero2 = sc.nextInt();
		System.out.print("Escribe otro número: ");
		numero3 = sc.nextInt();
		System.out.println("La media de sus tres números es: " + Media.media(numero1, numero2, numero3));
		sc.close();
	}

}
