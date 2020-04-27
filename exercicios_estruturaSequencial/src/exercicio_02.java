import java.util.Scanner;
import java.util.Locale;

public class exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double pi = 3.14159, raio = entrada.nextDouble();
		double area = pi * (Math.pow(raio, 2));
		
		System.out.printf("A área do círculo é: %.4f%n", area);
		entrada.close();
	}

}
