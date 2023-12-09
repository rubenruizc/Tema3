package ejercicio5t3sobrecarga;

import java.util.Random;

public class NumerosAleatorios {
	public static void numAleatorios(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			int num;
			Random random = new Random();
			num = random.nextInt(0, 2);
			System.out.println(num);
		}
	}

	public static void numAleatorios(int cantidad, int valorMaximo) {
		for (int i = 0; i < cantidad; i++) {
			int num;
			Random random = new Random();
			num = random.nextInt(0, valorMaximo + 1);
			System.out.println(num);
		}
	}

	public static void numAleatorios(int cantidad, int valorMinimo, int valorMaximo) {
		for (int i = 0; i < cantidad; i++) {
			int num;
			Random random = new Random();
			num = random.nextInt(valorMinimo, valorMaximo + 1);
			System.out.println(num);
		}
	}
}
