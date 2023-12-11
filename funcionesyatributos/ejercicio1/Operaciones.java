package ejercicio1;

public class Operaciones {
	
	// Atributo donde guardaremos el número 1
	double num1;
	
	// Atributo donde guardaremos el número 2
	double num2;

	// Constructor vacío
	public Operaciones() {
	}

	// Constructor con parámetros
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// Función del objeto operaciones que calculara la suma
	double suma() {
		return num1 + num2;
	}

	// Función del objeto operaciones que calculara la resta
	double resta() {
		return num1 - num2;
	}

	// Función del objeto operaciones que calculara la multiplicación
	double multiplicacion() {
		return num1 * num2;
	}

	// Función del objeto operaciones que calculara la división
	double division() {
		
		// Condicional por si el número introducido por el usuario es 0
		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("Error: No se puede dividir por cero.");
			return Double.NaN; // NaN (Not a Number) representa un valor no numérico
		}
	}

	// Función del objeto operaciones que calculara la suma
	double max() {
		return Math.max(num1, num2);
	}

	// Función del objeto operaciones que calculara la suma
	double min() {
		return Math.min(num1, num2);
	}
}
