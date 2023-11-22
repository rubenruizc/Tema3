package ejercicio5t3;

public class TablaDeMultiplicar {

	public static void tablademultiplicar(int numero) {
		System.out.println("Tabla de multiplicar del " + numero + ":");

		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}

	}
}
