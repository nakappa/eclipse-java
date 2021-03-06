/*
 * POLIMORFISMO -> recurso que permite que vari�veis de um mesmo tipo mais gen�rico possam apontar para objetos de tipos espec�ficos diferentes, tendo assim comportamentos diferentes conforme cada tipo espec�fico.
 * 
 * OBS.: Importante entender:
 * 				-> a associa��o do tipo espec�fico com o tipo gen�rico � feita em tempo de execu��o (upcasting);
 * 				-> o compilador n�o sabe para qual tipo espec�fico a chamada do m�todo est� sendo feita.
 */

import herancaPolimorfismo.entities.Account;
import herancaPolimorfismo.entities.SavingsAccount;

public class polimorfismo {

	public static void main(String[] args) {
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
