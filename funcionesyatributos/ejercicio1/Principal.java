package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// Declaración del scanner como variable global
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Variable donde guardaremos la opción del usuario
		int opcion;

		// Variable donde guardaremos el primer número del usuario
		double num1;

		// Variable donde guardaremos el segundo número del usuario
		double num2;

		// Le pedimos la opción
		opcion = menu();
		
		// Le pedimos el número 1
		num1 = pideNumero();

		// Le pedimos el número 2
		num2 = pideNumero();

		// Creamos el objeto y le ponemos un nombre y los parametrós que recogerá
		Operaciones operaciones = new Operaciones(num1, num2);

		// Condicional para mostrar dependiendo de la opción elegida
		switch (opcion) {
		case 1 -> System.out.println("Suma: " + operaciones.suma());
		case 2 -> System.out.println("Resta: " + operaciones.resta());
		case 3 -> System.out.println("Multiplicación: " + operaciones.multiplicacion());
		case 4 -> System.out.println("División: " + operaciones.division());
		case 5 -> System.out.println("Máximo: " + operaciones.max());
		case 6 -> System.out.println("Mínimo: " + operaciones.min());
		}

		// Cerramos el scanner al final del programa
		sc.close();

	} // Cierre del main

	// Función que mostrará al usuario el menú con las distintas opciones
	public static int menu() {
		int opcion;
		System.out.println();
		System.out.println("Menú:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");
		System.out.println();

		// Bucle que se realizara mientras la opción del usuario sea entre 0 y 6
		do {
			System.out.print("Elige una opción: ");

			// Try-Catch para evitar que introduzca valores erróneos
			try {
				opcion = sc.nextInt();

				// Condicional por si la opción no está entre 0 y 6
				if (opcion < 0 || opcion > 6) {
					System.out.println("Opción no válida. Introduce un número del menú.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error: Debes introducir un número entero.");
				sc.nextLine(); // Limpiar el buffer del scanner
				opcion = -1;
			}

		} while (opcion < 0 || opcion > 6);

		return opcion;
	}

	// Función que le pedira al usuario los números deseados
	public static double pideNumero() {
		double numero = 0;
		boolean valido = false;
		// Bucle que se realizara mientras la opción valido sea false
		do {
			System.out.print("Introduce un número: ");
			// Try-Catch para evitar que introduzca valores erróneos
			try {
				numero = sc.nextDouble();
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println("Error: Debes introducir un número válido.");
				sc.nextLine(); // Limpiar el buffer del scanner
			}

		} while (!valido);

		return numero;

	}

} // Cierre de la clase
