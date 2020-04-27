import java.util.Locale; // importa a classe (biblioteca).
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.print("Olá mundo! "); // serve para exibir no console na mesma linha.
		System.out.println("Bom dia"); // serve para exibir no console com uma quebra de linha.
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		// Saída de dados
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); // serve para formatar a quantida de casas decimais a serem exibidas.
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US); // serve para usar a formatação de local selecionado.
		System.out.printf("%.4f%n", x);
		
		// Concatenação
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		// Entrada de Dados
		Scanner sc = new Scanner(System.in); // Scanner -> serve para inicializar a entradas de dados pelo teclado.
		
		String s = sc.next(); // .next -> usado para digitar textos.
		System.out.println("Você digitou: " + s);
		
		int i = sc.nextInt(); // .nextInt -> usado para digira números inteiros.
		System.out.println("Você digitou: " + i);
		
		double d = sc.nextDouble(); // .nextInt -> usado para digira números inteiros.
		System.out.println("Você digitou: " + d); 

		char c = sc.next().charAt(0); // .next().charAt(x) -> serve para pegar um caracter de uma string (ex. sc.next().charAt(0) - pega o primeiro caracter).
		System.out.println("Você digitou: " + c);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine(); // .nextLine() -> serve para ler uma linha inteira
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Você digitou: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// OBS.: cuidado ao usar .nextLine() depois de um .nextInt (.nextAlgumaCoisa), pois ao precionar Enter, ele vai ser lido como dado na variável seguinte.
		y = sc.nextInt();
		sc.nextInt();
		s1 = sc.next();
		s2 = sc.next();
		s3 = sc.next();
		
		sc.close(); // .close -> serve para avisar que a insersão de dados acabou.
	}
}
