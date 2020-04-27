import java.util.Scanner;
import java.util.Locale;

public class exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, valor;
		double hora, salario;
		
		num = sc.nextInt();
		valor = sc.nextInt();
		hora = sc.nextDouble();
		salario = valor * hora;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", num, salario);
		sc.close();
	}

}
