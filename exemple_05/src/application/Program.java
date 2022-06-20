package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER THE QUANTITY OF PRODUCTS:");
		
		int n = sc.nextInt();
		Product[] products = new Product[n];

		System.out.println("ENTER NAME AND PRINCE:");
		
		for(int i=0; i<products.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			products[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for (int i=0; i<products.length; i++) {
			sum += products[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRINCE = %.2f%n", avg );
		
		sc.close();
	}

}
