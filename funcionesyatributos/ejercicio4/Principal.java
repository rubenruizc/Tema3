package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// Declaración del scanner como variable global
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Variable donde guardaremos la opción del usuario
		int opcion;

		// Variable donde guardaremos el radio de la base
		double radioBase;

		// Variable donde guardaremos la altura
		double altura;

		// Le pedimos el radio de la base
		radioBase = pideRadioBase();

		// Le pedimos la altura
		altura = altura();

		// Le pedimos la opción del menú
		opcion = menu();

		// Creamos el objeto y le ponemos un nombre y los parametrós que recogerá
		Cilindro cil = new Cilindro(radioBase, altura);

		// Condicional para mostrar dependiendo de la opción elegida
		switch (opcion) {
		case 1 -> System.out.println("El volumen de su cilindro es: " + cil.volumen());
		case 2 -> System.out.println("El área de su cilindro es: " + cil.area());
		case 0 -> System.out.println("Nos vemos, un saludo");
		}

		// Cerramos el scanner al final del programa
		sc.close();

	} // Cierre del main

	// Función que mostrará al usuario el menú con las distintas opciones
	public static int menu() {
		int op;
		System.out.println("Menú");
		System.out.println("1.Volumen");
		System.out.println("2.Área");
		System.out.println("0.Salir");
		
		do {

			System.out.print("Elija una opción: ");

			try {

				op = sc.nextInt();

				if (op < 0 || op > 2) {

					System.out.println("Opción no válida. Introduce un número del menú.");

				}

			} catch (InputMismatchException e) {

				System.out.println("Error: Debes introducir un número entero.");

				sc.nextLine(); // Limpiar el buffer del scanner

				op = -1;
			}

		} while (op < 0 || op > 2);
		return op;
	}

	// Función que le pedira al usuario el radio de la base deseado
	public static double pideRadioBase() {
		double radioBase=0;
		boolean valido = false;
		do {

			System.out.println("Introduzca el radio: ");

			try {

				radioBase = sc.nextDouble();

				valido = true;
				
				if (radioBase <0) {
					System.out.println("Opción no válida. Introduce un número entero");
					valido = false;
				}
				
			} catch (InputMismatchException e) {

				System.out.println("Error: Debes introducir un número válido.");

				sc.nextLine(); // Limpiar el buffer del scanner
			}
		} while (!valido || radioBase < 0);
		
		return radioBase;
	}

	// Función que le pedira al usuaerio la altura deseada
	public static double altura() {
		double altura=0;
		boolean valido = false;
		do {

			System.out.println("Introduzca la altura: ");

			try {

				altura = sc.nextDouble();

				valido = true;

			} catch (InputMismatchException e) {

				System.out.println("Error: Debes introducir un número válido.");

				sc.nextLine(); // Limpiar el buffer del scanner
			}
		} while (!valido || altura < 0);
		
		return altura;
	}

} // Cierre de la clase
