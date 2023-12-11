package ejercicio4;

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
		System.out.println("Elija una opción: ");
		op = sc.nextInt();
		return op;
	}

	// Función que le pedira al usuario el radio de la base deseado
	public static double pideRadioBase() {
		double radioBase;
		System.out.println("Elija el radio de la base: ");
		radioBase = sc.nextDouble();
		return radioBase;
	}

	// Función que le pedira al usuaerio la altura deseada
	public static double altura() {
		double altura;
		System.out.println("Elija la altura: ");
		altura = sc.nextDouble();
		return altura;
	}

} // Cierre de la clase
