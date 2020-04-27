import java.util.Locale;
import java.util.Scanner;

public class usandoDebug {
	
	// Para usar o Debug:
	// 1� - Selecione uma linha;
	// 2� - Crie um breakpoint (Run - Toggle Breakpoint ou Shift + Ctrl + B);
	// 3� - Clique com o bot�o direito em cima da classe;
	// 4� - V� me Debug As, Java Application;
	// 5� - Quando o progra solicitar para entrar em modo Debug, clique sim;
	// 6� - Para que o programa rode a linha de comando seguinte, aperte F6;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = R$ %.2f%n", preco);
		sc.close();
	}
}