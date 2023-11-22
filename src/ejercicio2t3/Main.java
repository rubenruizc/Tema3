package ejercicio2t3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca dos números enteros
        System.out.print("Introduzca el primer número entero: ");
        numero1 = sc.nextInt();

        System.out.print("Introduzca el segundo número entero: ");
        numero2 = sc.nextInt();

        // Llamar a la función para mostrar los números comprendidos entre los dos números ingresados
        NumerosComprendidos.numerosComprendidos(numero1, numero2);

        // Cerramos el Scanner
        sc.close();

	}

}
