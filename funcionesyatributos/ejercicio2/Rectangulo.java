package ejercicio2;

public class Rectangulo {
	
	// Atributo donde guardaremos el alto
	double alto;
	
	// Atributo donde guardaremos el ancho
	double ancho;

	// Constructor vacio
	public Rectangulo() {
	}

	// Constructor con los parámetros
	public Rectangulo(double alto, double ancho) {
		super();
		this.alto = alto;
		this.ancho = ancho;
	}
	
	// Función del objeto rectángulo que calculara el perímetro
	double perimetro() {
		double perimetro;
		perimetro = 2 * (alto + ancho);
		return perimetro;
	}
	
	// Función del objeto rectángulo que calculara el área
	double area() {
		double area;
		area = alto * ancho;
		return area;
	}

}
