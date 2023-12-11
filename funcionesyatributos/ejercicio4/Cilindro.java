package ejercicio4;

public class Cilindro {
	// Atributo donde guardaremos el radio de la base
	double radioBase;

	// Atributo donde guardaremos la altura
	double altura;

	// Constructor vacio
	public Cilindro() {
	}

	// Constructor con los parámetros
	public Cilindro(double radioBase, double altura) {
		super();
		this.radioBase = radioBase;
		this.altura = altura;
	}

	// Función del objeto cilindro que calculara el volumen
	double volumen() {
		double volumen;
		volumen = Math.PI * Math.pow(radioBase, 2) * altura;
		return volumen;
	}

	// Función del objeto cilindro que calculara el área
	double area() {
		double area;
		area = (2 * Math.PI * radioBase * altura) + (2 * Math.PI * Math.pow(radioBase, 2));
		return area;
	}

}