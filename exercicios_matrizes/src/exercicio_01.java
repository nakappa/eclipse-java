import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nº de linhas e colunas: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		System.out.println();
		System.out.println("Digite os valores que as linhas receberam em cada coluna: ");
        for (int i = 0; i < mat.length; i++) {
        	for (int j = 0; j < mat[i].length; j++) mat[i][j] = sc.nextInt();
        }

		System.out.println();
        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < mat.length; i++) System.out.print(mat[i][i] + " ");

		System.out.println();
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
        	for (int j = 0; j < mat[i].length; j++) if (mat[i][j] < 0) count++;
        }
        
        System.out.println("Quantidade de nº negativos: " + count);
    
		sc.close();
	}

}
