package ejercicio5t3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        // Pedir al usuario que ingrese un número entero
	        System.out.print("Introduzca un número entero para ver su tabla de multiplicar: ");
	        int numeroIngresado = scanner.nextInt();

	        // Llamar a la función para mostrar la tabla de multiplicar del número ingresado
	        TablaDeMultiplicar.tablademultiplicar(numeroIngresado);

	        // Cerraros el Scanner
	        scanner.close();

	}

}
