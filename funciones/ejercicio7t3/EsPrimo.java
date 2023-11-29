package ejercicio7t3;

public class EsPrimo {
	public static boolean esPrimo (int numero) {
		boolean primo = true;
		
		for (int i = 2; i<= Math.sqrt(numero); i++) {
			if (numero%i==0) {
				primo = false;	
			}
			
		}
		return primo;	
	}
	
}
