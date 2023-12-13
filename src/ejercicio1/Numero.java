package ejercicio1;

public class Numero {
	// Atributo donde guardaremos el número del usuario
	int numero;

	// Constructor vacio
	public Numero() {
	}

	// Constructor con parámetro
	public Numero(int numero) {
		super(); // Llamada al constructor de la clase base (Object), que no es necesario en este
					// caso
		this.numero = numero;
	}

	// Método para verificar si el número es primo
	boolean esPrimo() {
		boolean esPrimo = true;

		// Contar desde 2 hasta el número ingresado por el usuario
		for (int i = 2; i <= numero; i++) {
			// Contar desde 2 hasta 'i - 1' para verificar si 'i' es divisible por algún
			// número en este rango
			for (int j = 2; j < i; j++) {
				// Si 'i' es divisible por 'j', entonces 'i' no es primo
				if (i % j == 0) {
					esPrimo = false;
					break;
				}
			}
		}

		return esPrimo;
	}

	// Método para verificar si el número es capicúa
	boolean esCapicua() {
		boolean esCapicua = false;
		int invertido = 0;
		int num = numero; // Variable para no modificar la variable 'numero'

		// Invertir el número
		while (num > 0) {
			int digito = num % 10;
			invertido = invertido * 10 + digito;
			num = num / 10;
		}

		// Comprobar si el número original es igual al invertido
		if (numero == invertido) {
			esCapicua = true;
		}

		return esCapicua;
	}
}
