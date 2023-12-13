package ejercicio4t3sobrecarga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero1;
		String cadena;
		Scanner sc = new Scanner (System.in);
		System.out.println("Escriba un número: ");
		numero1 = sc.nextInt();
		System.out.println(ParseToBoolean.parseToBoolean(numero1));
		System.out.println();
		System.out.println("Escriba true o false");
		cadena = sc.next();
		System.out.println(ParseToBoolean.parseToBoolean(cadena));
		sc.close();
		
		}

	}


