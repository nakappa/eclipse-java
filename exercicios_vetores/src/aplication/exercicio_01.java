package aplication;

import java.text.ParseException;
import java.util.Scanner;

import entidades.Aluguel;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.print("Quantos alugueis serão registrados? ");
		int qteRegistros = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i <= qteRegistros; i++) {
			System.out.print("Dados do " + i + "º aluguel:");
			System.out.println();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluguel(nome, email);
			System.out.println();
		}
		
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < vect.length; i++) if (vect[i] != null) System.out.println(i + ": " + vect[i]);
		
		sc.close();
	}

}
