package ejercicio2t3sobrecarga;



public class Media {
	public static double media (int numero1, int numero2) {
		double res;
		res = (numero1 + numero2) / 2;
		return res;
	}
	
	public static double media (int numero1, int numero2, int numero3) {
		double res;
		res = (numero1+ numero2 * numero3)/3;
		return res;
	}
	

}
