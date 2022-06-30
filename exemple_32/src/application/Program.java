/*
 * GENERICS
 * PERMITE PARAMETRIZAR O TIPO DA CLASSE
 * BENEFÍCIOS: REUSO, TYPE SAFETY, PERFORMANCE
 */

package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.printf("How many vlaues: ");
		int n = sc.nextInt();
		System.out.println("Type Values:");
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("first: " + x);
		
		sc.close();
		
	}

}
