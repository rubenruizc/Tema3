package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Variable donde guardaremos la opción del usuario
		int opcion;
		
		// Variable donde guardaremos el radio del usuario
		double radio;

		// Obtener la opción del menú
		opcion = menu();

		// Verificar si el usuario eligió salir
		if (opcion != 0) {
			// Pedir al usuario que ingrese el radio de la esfera
			radio = pideNumero();

			// Crear un objeto Esfera con el radio proporcionado
			Esfera esf = new Esfera(radio);

			// Realizar la operación correspondiente según la opción del menú
			switch (opcion) {
			case 1 -> System.out.println("El volumen es: " + esf.volumenEsfera());
			case 2 -> System.out.println("La superficie es: " + esf.superficieEsfera());
			}
		} else {
			// El usuario eligió salir, mostrar un mensaje de despedida
			System.out.println("Hasta luego...");
		}

		// Cerrar el scanner para evitar posibles fugas de recursos
		sc.close();
	} // Cierre del main

	// Función para mostrar el menú y obtener la opción del usuario
	public static int menu() {
		int opcion;
		System.out.println("Menú: ");
		System.out.println("1. Volumen");
		System.out.println("2. Superficie");
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
} // Cierre de la clase
