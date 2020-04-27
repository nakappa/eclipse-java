import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = C * A / 2;
		circulo = pi * (C * C);
		trapezio = (A + B) * C / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		// System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO %.3f%nRETANGULO %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		sc.close();
	}

}
