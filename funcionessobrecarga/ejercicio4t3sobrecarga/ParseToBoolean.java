package ejercicio4t3sobrecarga;

public class ParseToBoolean {
	public static boolean parseToBoolean(int numero1) {
		boolean verdad = true;
		
		if (numero1 == 0) {
			verdad = false;
		}		
		return verdad;
	}
	
	public static boolean parseToBoolean (String cadena) {
		boolean verdad = true;
		if (cadena.equalsIgnoreCase("false")){
			verdad=false;
		}
		return verdad;
	}
}
