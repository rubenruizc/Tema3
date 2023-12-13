package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// Declaración del scanner como variable global
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número del usuario
		int numero;
		
		// Variable donde guardaremos el número del usuario
		int opcion;

		// Obtener la opción del menú
		opcion = menu();

		// Verificar si el usuario eligió salir
		if (opcion != 0) {
			// Pedir al usuario que ingrese un número
			numero = pideNumero();

			// Crear un objeto Numero con el número proporcionado
			Numero num = new Numero(numero);

			// Realizar la operación correspondiente según la opción del menú
			switch (opcion) {
			case 1:
				// Comprobar si el número es primo y mostrar el resultado
				if (num.esPrimo()) {
					System.out.println("El número " + numero + " es primo");
				} else {
					System.out.println("El número " + numero + " no es primo");
				}
				break;
			case 2:
				// Comprobar si el número es capicúa y mostrar el resultado
				if (num.esCapicua()) {
					System.out.println("El número " + numero + " es capicúa");
				} else {
					System.out.println("El número " + numero + " no es capicúa");
				}
			}

		} else {
			// El usuario eligió salir, mostrar un mensaje de despedida
			System.out.println("Hasta pronto...");
		}

		// Cerrar el scanner para evitar posibles fugas de recursos
		sc.close();
	}

	// Función para mostrar el menú y obtener la opción del usuario
	public static int menu() {
		int opcion;
		System.out.println("Menú: ");
		System.out.println("1. Comprobar si es primo");
		System.out.println("2. Comprobar si es capicua");
		System.out.println("0. Salir");

		// Validar la entrada del usuario
		do {
			System.out.println("Elige una opción: ");
			try {
				opcion = sc.nextInt();

				// Verificar si la opción está fuera del rango permitido
				if (opcion < 0 || opcion > 2) {
					System.out.println("Opción no válida. Introduce un número del menú.");
				}

			} catch (InputMismatchException e) {
				// Capturar excepción si se introduce un tipo de dato incorrecto
				System.out.println("VALOR MAL INTRODUCIDO");
				sc.nextLine(); // Limpiar el buffer del scanner
				opcion = -1;
			}

		} while (opcion < 0 || opcion > 2);

		return opcion;
	}

	// Función para obtener un número válido del usuario
	public static int pideNumero() {
		int numero = 0;
		boolean valido = false;

		// Validar la entrada del usuario
		do {
			System.out.println("Introduzca un número: ");
			try {
				numero = sc.nextInt();

				// Verificar si el número ingresado es válido
				if (numero > 0) {
					valido = true;
				} else {
					System.out.println("Introduzca un valor correcto");
				}

			} catch (InputMismatchException e) {
				// Capturar excepción si se introduce un tipo de dato incorrecto
				System.out.println("VALOR MAL INTRODUCIDO");
				sc.nextLine(); // Limpiar el buffer del scanner
			}

		} while (!valido);

		return numero;
	}
}
