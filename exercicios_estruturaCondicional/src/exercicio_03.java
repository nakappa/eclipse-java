import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) System.out.print("S�o M�ltiplos");
		
		else System.out.print("N�o s�o M�ltiplos");
		
		sc.close();
	}

}
