package ejercicio6t3;

public class Cilindro {
	public static double areaVolumen (int opc, double radio, double altura) {
	double res = 0;
	switch (opc) {
	case 1 -> res = 2*Math.PI*radio*(altura+radio);
	case 2 -> res = Math.PI* Math.pow(radio, 2)* altura;
	}
	return res;
	}
}
