import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, qte1, cod2, qte2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		qte1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qte2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = (qte1 * preco1) + (qte2 * preco2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		sc.close();
	}

}
