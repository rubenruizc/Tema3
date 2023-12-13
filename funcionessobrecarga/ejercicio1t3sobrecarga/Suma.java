package ejercicio1t3sobrecarga;

public class Suma {
	public static int suma (int numero1, int numero2) {
		int res;
		res = numero1 + numero2;
		return res;
	}
	
	public static double suma (double numero1, double numero2) {
		double res = 0;
		res = numero1 + numero2;
		return res;
	}
}
