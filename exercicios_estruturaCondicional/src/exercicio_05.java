import java.util.Scanner;
import java.util.Locale;

public class exercicio_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int qte = sc.nextInt();
		double preco = 0;

		switch (cod) {
		case 1:
			preco = 4.0;
			break;

		case 2:
			preco = 4.5;
			break;

		case 3:
			preco = 5.0;
			break;

		case 4:
			preco = 2.0;
			break;

		case 5:
			preco = 1.50;
			break;

		default:
			System.out.println("Produto inválido!!!");
			break;
		}

		if (cod >= 0 && cod <= 5) {
			double total = preco * qte;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		else System.out.println("Favor escolher outro produto!!!");

		sc.close();
	}

}
