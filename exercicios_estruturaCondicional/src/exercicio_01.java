import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num >= 0) System.out.println("N�O NEGATIVO");
		
		else System.out.println("NEGATIVO");
		
		sc.close();
	}

}
