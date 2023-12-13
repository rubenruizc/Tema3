package ejercicio6t3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		int radio;
		int altura;
		Scanner sc = new Scanner (System.in);
		System.out.println("Que opción desea: (1:ÁREA) (2:VOLUMEN)");
		opcion = sc.nextInt();
		System.out.println("Indique el radio deseado: ");
		radio = sc.nextInt();
		System.out.println("Indique la altura deseada: ");
		altura = sc.nextInt();
		
		if (opcion==1) {
			System.out.println("El área de su cilindro es: " + Cilindro.areaVolumen(opcion, radio, altura));
		} else
			System.out.println("El volumen de su cilindro es: " + Cilindro.areaVolumen(opcion, radio, altura));
		
		sc.close();
	}

}
