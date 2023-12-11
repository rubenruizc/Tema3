package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	// Declaración del scanner como variable global
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Variable donde guardaremos la opción del ususario
		int opcion;

		// Variable donde guardaremos el alto que desee el usuario
		double alto;

		// Variable donde guardaremos el ancho que desee el usuario
		double ancho;
			
			// Le pedimos el alto
			alto = pideAlto();
			
			// Le pedimos el ancho
			ancho = pideAncho();
			
			// Le pedimos la opción del menú
			opcion = menu();

			// Creamos el objeto y le ponemos un nombre y los parametrós que recogerá
			Rectangulo rec = new Rectangulo(alto, ancho);

			// Condicional para mostrar dependiendo de la opción elegida
			switch (opcion) {
			case 1 -> System.out.println("El perímetro es: " + rec.perimetro());
			case 2 -> System.out.println("El área es: " + rec.area());
			case 0 -> System.out.println("Un saludo, vuelva pronto");
			}

		// Cerramos el scanner al final del programa
		sc.close();

	} // Cierre del main

	// Función que mostrará al usuario el menú con las distintas opciones
	public static int menu() {
		
		int op;
		
		System.out.println("Menú");
		
		System.out.println("1.Perímetro");
		
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

	// Función que le pedirá al usuario la altura deseada
	public static double pideAlto() {
		
		double alto = 0;
		
		boolean valido = false;

		do {

			System.out.println("Introduzca la altura: ");

			try {

				alto = sc.nextDouble();

				valido = true;

			} catch (InputMismatchException e) {

				System.out.println("Error: Debes introducir un número válido.");

				sc.nextLine(); // Limpiar el buffer del scanner
			}
		} while (!valido || alto < 0);

		return alto;
	}

	// Función que le pedira al ussuario el ancho deseado
	public static double pideAncho() {
		
		double ancho = 0;
		
		boolean valido = false;

		do {
			
			System.out.println("Introduzca la ancho: ");
			
			try {
				
				ancho = sc.nextDouble();
				
				valido = true;
				
			} catch (InputMismatchException e) {

				System.out.println("Error: Debes introducir un número válido.");

				sc.nextLine(); // Limpiar el buffer del scanner
			}
			
		} while (!valido || ancho<0);

		return ancho;
	}

} // Cierre de la clase
