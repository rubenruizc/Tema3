package ejercicio3t3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números enteros
        System.out.print("Introduzca el primer número entero: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduzca el segundo número entero: ");
        int numero2 = sc.nextInt();

        // Llamar a la función para obtener el máximo de los dos números
        int maximo =MaximoDeDosNumeros.maximodedosnumeros(numero1, numero2);

        // Mostrar el resultado
        System.out.println("El máximo de " + numero1 + " y " + numero2 + " es: " + maximo);

        // Cerraramos el Scanner
        sc.close();

	}

}
