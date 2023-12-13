package ejercicio8t3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		int divisores;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		
		divisores = Division.numDivisoresPrimos(numero);
		
		System.out.println("Número de divisores: " + divisores);
		
		sc.close();

	}

}




