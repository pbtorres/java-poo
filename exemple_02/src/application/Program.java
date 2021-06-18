package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean choose = true;
		Product product = new Product();
		
		System.out.printf("Enter product data:\n");
		System.out.printf("Name: ");
		product.name = sc.nextLine();
		
		System.out.printf("Price: ");
		product.price = sc.nextDouble();
		
		System.out.printf("Quantity: ");
		product.quantity = sc.nextInt();
		System.out.println(product);
		sc.nextLine();
				
		
		while(choose) {
			System.out.printf("want add some more product to stock? 0/1: ");
			choose = sc.nextBoolean();
			
			if(choose) {
				System.out.printf("Enter the nuber of products to be added on stock: ");
				int quantity = sc.nextInt();
				product.addProducts(quantity);
				
				System.out.println("Update data: " + product);
				
				System.out.printf("want add some more product to stock? 0/1: ");
				choose = sc.nextBoolean();
				
				if(choose) {
					System.out.printf("Enter the nuber of products to be removed from stock: ");
					quantity = sc.nextInt();
					product.removeProducts(quantity);
					System.out.println("Update data: " + product);

				}else {
					choose = false;
					System.out.println("Saindo do programa!");
					break;
				}
				
			}else {
				choose = false;
				System.out.println("Saindo do programa!");
				break;
			} 
			
		}
		System.out.println("alteração para o git");
				
		sc.close();
	}

}
