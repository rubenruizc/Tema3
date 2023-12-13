package ejercicio3t3sobrecarga;

public class SumaEnteros {
	public static int sumaEnteros (int numero1) {
		int res=0;
		for (int i =1; i <= numero1;i++) {
			res += i;
		}
		return res;
	}
	public static int sumaEnteros (int numero1, int numero2) {
		int res = 0;
		int suma = numero1 + numero2;
		for (int i = 1 ; i <= suma; i++) {
			res+= i;
		}
		return res;
	}
}
