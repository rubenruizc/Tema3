package ejercicio10t3;

public class CompruebaFecha {
	public static boolean compruebaFecha(int dia, int mes, int anio) {
		boolean esCorrecta = false;

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (dia > 0 && dia <= 31) {
				esCorrecta = true;
			}
		
		case 4, 6, 9, 11:
			if (dia > 0 && dia <= 30) {
				esCorrecta = true;
			}
		
		case 2:
			if (esBisiesto(anio)) {
				if (dia > 0 && dia <= 29) {
					esCorrecta = true;
				}
				
			} else if (dia > 0 && dia <= 28) {
				esCorrecta = true;

			}
		}
		return esCorrecta;
	}

	public static boolean esBisiesto(int anio) {
		boolean bisiesto = false;
		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
			bisiesto = true;
		}
		return bisiesto;
	}
}
