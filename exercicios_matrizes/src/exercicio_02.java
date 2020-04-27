import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nº de linhas e colunas: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		System.out.println();
		System.out.println("Digite os valores que as linhas receberam em cada coluna: ");
        for (int i = 0; i < mat.length; i++) {
        	for (int j = 0; j < mat[i].length; j++) mat[i][j] = sc.nextInt();
        }

		System.out.println();
        System.out.print("Digite um nº para saber qual é a sua posição e os nº próximos: ");
        int x = sc.nextInt();

        System.out.println();
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                if (mat[i][j] == x)
                {
                	System.out.println("Posição " + i + "," + j + ": ");
                	
                    if (j > 0) System.out.println("Esquerda: " + mat[i][j - 1]);

                    if (i > 0) System.out.println("Acima: " + mat[i - 1][j]);

                    if (j < n - 1) System.out.println("Direita: " + mat[i][j + 1]);

                    if (i < n - 1) System.out.println("Abaixo: " + mat[i + 1][j]);
                    
                    System.out.println();
                }
            }
        }
    
		sc.close();
	}

}
