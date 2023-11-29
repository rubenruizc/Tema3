package ejercicio9t3;

public class Calculadora {
	// Parámetros que voy a pasarle a la función
	public static double calculadora(int opcion, double numero1, double numero2) {
		double res = 0.0;
		switch (opcion) {
		case 1 -> res = numero1 + numero2;
		case 2 -> res = numero1 - numero2;
		case 3 -> res = numero1 * numero2;
		case 4 -> res = numero1 / numero2;
		}
		return res;
	}
}
