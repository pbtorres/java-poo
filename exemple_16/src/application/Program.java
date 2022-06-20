/*
 * SWITCH CASE
 * HERANÇA
 * POLIMORFISMO
 * SOBRECARGA E SOBRESCRITA DE MÉTODO
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		List<Product> product = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or import (c/u/i)? ");
			char value = sc.next().charAt(0);
			sc.nextLine();
			
			switch(value){
				case 'c': {
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Price: ");
					Double price = sc.nextDouble();
					product.add(new Product(name, price));
					break;
				}
				case 'u': {
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Price: ");
					Double price = sc.nextDouble();
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date manufacture = sdf.parse(sc.next());
					product.add(new UsedProduct(name, price, manufacture));
					break;
				}
				case 'i': {
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Price: ");
					Double price = sc.nextDouble();
					System.out.print("Customs fee: ");
					Double cf = sc.nextDouble();
					product.add(new ImportProduct(name, price, cf));
					break;
				}

			}	

		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product p : product ) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}
}
