package ejercicio3;

import java.util.Scanner;

public class Principal {

	// Declaración del scanner como variable global
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Variable donde guardaremos la opción del usuario
		int opcion;

		// Variable donde guardaremos el radio que desee el usuario
		double radio;

		// Le pedimos el radio
		radio = pideRadio();

		// Le pedimos la opción del menú
		opcion = menu();

		// Creamos el objeto y le ponemos un nombre y los parametrós que recogerá
		Circulo cir = new Circulo(radio);

		// Condicional para mostrar dependiendo de la opción elegida
		switch (opcion) {
		case 1 -> System.out.println("La circunferencia de su círculo es: " + cir.circunferencia());
		case 2 -> System.out.println("El área de su círculo es: " + cir.area());
		case 0 -> System.out.println("Nos vemos, un saludo");
		}

		// Cerramos el scanner al final del programa
		sc.close();

	} // Cierre del main

	// Función que mostrará al usuario el menú con las distintas opciones
	public static int menu() {
		int op = 0;
		System.out.println("Menú");
		System.out.println("1.Circunferencia");
		System.out.println("2.Área");
		System.out.println("0.Salir");
		System.out.print("Elija una opción: ");
		op = sc.nextInt();
		return op;
	}

	// Función que le pedira al usuario el radio deseado
	public static double pideRadio() {
		double radio = 0;
		System.out.print("Elija un radio: ");
		radio = sc.nextDouble();
		return radio;
	}

} // Cierre de la clase
