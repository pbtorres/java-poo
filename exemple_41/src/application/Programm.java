/*
 * Usando expressão lambda como argumento
 */
package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Programm {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort((p1, p2) -> p1.getName().toLowerCase().compareTo(p2.getName().toLowerCase()));
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
