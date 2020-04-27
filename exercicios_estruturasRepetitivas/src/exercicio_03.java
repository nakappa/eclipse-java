import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		
		while(cod != 4) {
			if (cod == 1) alcool++;
			else if (cod == 2) gasolina++;
			else if (cod == 3) disel++;
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Disel: " + disel);
		
		sc.close();
	}

}
