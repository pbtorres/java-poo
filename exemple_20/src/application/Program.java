/*
 * TRY/CATCH
 * EXCEPTIONS
 * RUNTIMEEXEPTION
 */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exeptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.printf("Número: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.printf("Titular: ");
		String holder = sc.nextLine();
		System.out.printf("Saldo inicial: ");
		Double balance = sc.nextDouble();
		System.out.printf("Limite de saque: ");
		Double withDrawLimit = sc.nextDouble();
		System.out.printf("Informe a quantia para sacar: ");
		Double value = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withDrawLimit);
		System.out.println();
		
		try {
			acc.withDraw(value);
			System.out.printf("Novo saldo %.2f", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
