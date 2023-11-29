package ejercicio2t3;

public class NumerosComprendidos {
	 // Función para mostrar los números entre dos enteros
    public static void numerosComprendidos(int num1, int num2) {
        // Asegurarse de que num1 sea menor o igual a num2
        if (num1 > num2) {
            int cambio = num1;
            num1 = num2;
            num2 = cambio;
        }

        System.out.println("Números comprendidos entre " + num1 + " y " + num2 + ":");

        for (int i = num1 + 1; i < num2; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Imprimir una línea en blanco al final
    }
}
