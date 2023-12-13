package ejercicio10t3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int dia;
		int mes;
		int anio;
		boolean esCorrecta;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un día:");
		dia = sc.nextInt();
		System.out.println("Introduzca un mes:");
		mes = sc.nextInt();
		System.out.println("Introduza un año:");
		anio = sc.nextInt();
		
		esCorrecta = CompruebaFecha.compruebaFecha(dia, mes, anio);
		
		if (esCorrecta) {
			System.out.println("La fecha introducida es válida");
		} else
			System.out.println("La fecha introducida no es válida");
		sc.close();

	}

}
