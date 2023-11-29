package ejercicio8t3;

import ejercicio7t3.EsPrimo;

public class Division {
	public static int numDivisoresPrimos(int numero) {
		int contador = 0;
		boolean primo;
		
		for(int i=2; i<=numero; i++) {
			primo = EsPrimo.esPrimo(i);
			
			if(numero%i==0 && primo) {
				contador++;
			}
		}
		
		
		return contador;
	}
}

