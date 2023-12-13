package ejercicio4t3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String car;
		boolean esVocal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un carácter: ");
		car = sc.next();

		esVocal = CompruebaVocal.compruebaVocal(car);

		if (esVocal) {
			System.out.println("Es vocal");
		} else
			System.out.println("No es vocal");
		sc.close();

	}

}
