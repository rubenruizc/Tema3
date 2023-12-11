package ejercicio3;

public class Circulo {

	// Atributo donde guardaremos el radio
	double radio;

	// Constructor vacio
	public Circulo() {
	}

	// Constructor con los parámetros
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	// Función del objeto círculo que calculara la circunferencia
	double circunferencia() {
		double circunferencia;
		circunferencia = (2 * Math.PI) * radio;
		return circunferencia;
	}

	// Función del objeto círculo que calculara el área
	double area() {
		double area;
		area = Math.PI * radio;
		return area;
	}

}
