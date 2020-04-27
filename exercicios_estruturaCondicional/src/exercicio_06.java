import java.util.Scanner;
import java.util.Locale;

public class exercicio_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor < 0.0 || valor > 100.0) System.out.println("Fora de intervalo");
		
		else if (valor <= 25.0) System.out.println("intervalo [0,25]");
		
		else if (valor <= 50.0) System.out.println("intervalo (25,50]");
		
		else if (valor <= 75.0) System.out.println("intervalo (50,75]");
		
		else System.out.println("intervalo (75,100]");
		
		sc.close();
	}

}
