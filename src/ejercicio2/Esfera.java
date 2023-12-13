package ejercicio2;

public class Esfera {
	// Atributo donde guardaremos el radio del usuario
	double radio;

	// Constructor por defecto
	public Esfera() {
	}

	// Constructor con parámetro
	public Esfera(double radio) {
		super(); // Llamada al constructor de la clase base (Object), que no es necesario en este
					// caso
		this.radio = radio;
	}

	// Método para calcular la superficie de la esfera
	double superficieEsfera() {
		double resultado;

		// Fórmula para calcular la superficie de la esfera
		resultado = 4 * Math.PI * Math.pow(radio, 2);

		return resultado;
	}

	// Método para calcular el volumen de la esfera
	double volumenEsfera() {
		double resultado;

		// Fórmula para calcular el volumen de la esfera
		resultado = (4 * Math.PI / 3) * Math.pow(radio, 3);

		return resultado;
	}
}
