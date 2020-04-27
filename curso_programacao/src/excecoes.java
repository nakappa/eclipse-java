/*
EXCE��ES
		-> qualquer condi��o de erro ou comportamento inesperado encontrado por um programa em execu��o
		-> permite que erros sejam tratados de forma consistente e flex�vel, usando boas pr�ticas
		-> em java, � um objeto herdado da classe:
			* java.lang.Exception - o compilador obriga a tratar ou propagar
			* java.lang.RuntimeException - o compilador n�o obriga a tratar ou propragar
			
		-> quando lan�ada, � propagada na pilha de chamadas de m�todos em execu��o, at� que seja capturada (tratada) ou o programa seja encerrado
		-> tem como vantagens:
			- delegar a l�gica do erro para a classe respons�vel por conhecer as regras que podem ocasionar o erro
			- trata de forma organizada (inclusive hier�rquica) exce��es de tipos diferentes
			- a execu��o pode carregar dados quaisquer
			
ESTRUTURA TRY-CATCH-FINALLY
		
		BLOCO TRY -> cont�m o c�dico que representa a execu��o normal do trecho de c�digo que pode acerretar em uma exce��o
		
		BLOCO CATCH
					-> cont�m o c�digo a ser executado caso uma exce��o ocorra
					-> deve ser especificado o tipo de exce��o a ser tratada (upcasting � permitido)
					
		BLOCO FINALLY
					-> cont�m c�digo a ser executado independentemente de ter ocorrido ou n�o uma exce��o
					-> exemplo cl�ssico: fechar aquivo, conex�o de banco de dados, ou outro recurso espec�fico ao final do processamneto
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import excecoes.entities.Reservation;

public class excecoes {

	public static void main(String[] args) throws ParseException {

		// method3();
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		// .after() - serve para verificar se uma data � ou n�o posterior a outra
		if (!checkOut.after(checkIn))
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now))System.out.println("Error in reservation: Check-out date must be after check-in date");
			else if (checkOut.after(checkIn))System.out.println("Error in reservation: Check-out date must be after check-in date");
			else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}

		sc.close();

		// System.out.println("End of program!");
	}

	/*
	 * public static void method1() { System.out.println("***METHOD1 START***");
	 * method2(); System.out.println("***METHOD1 END***"); }
	 * 
	 * public static void method2() { System.out.println("***METHOD2 START***");
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * try { String[] vect = sc.nextLine().split(" "); int position = sc.nextInt();
	 * System.out.println(vect[position]); } catch (ArrayIndexOutOfBoundsException
	 * e) { System.out.println("Invalid position"); e.printStackTrace(); // mostra
	 * toda a chamada de m�todos que acarreta a exce��o sc.next(); } catch
	 * (InputMismatchException e) { System.out.println("Input erro!"); } sc.close();
	 * System.out.println("***METHOD2 END***"); }
	 * 
	 * public static void method3() { System.out.println("***METHOD3 START***");
	 * File file = new File("C\\temp\\in.txt"); Scanner sc = null;
	 * 
	 * try { sc = new Scanner(file); while (sc.hasNextLine()) {
	 * System.out.println(sc.nextLine()); } } catch (FileNotFoundException e) {
	 * System.out.println("Error opening file: " + e.getMessage()); } finally { if
	 * (sc != null) sc.close(); }
	 * 
	 * System.out.println("Finally block executed");
	 * System.out.println("***METHOD3 END***"); }
	 */
}