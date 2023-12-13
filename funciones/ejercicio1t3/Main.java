package ejercicio1t3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable donde guardaremos el número del usuario
		int numero;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Comprobamos que introduce el valor correctamente
		try {

			// Le pedimos al usuario un número
			System.out.println("Escribe un número: ");

			// Leemos el número
			numero = sc.nextInt();
			
			// Imprimimos el mensaje
			Eco.eco(numero);
			
		} catch (InputMismatchException e) {
			System.out.println("Valor mal introducido");
			sc.nextLine();
			
		} finally {
			sc.close();
		}

	}

}
