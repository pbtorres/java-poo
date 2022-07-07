/*
 * Usando expressão lambda declarada
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		Consumer<Product> cons = new Consumer<Product>() {

			@Override
			public void accept(Product p) {
				p.setPrice(p.getPrice() * 1.1);
			}
			
		};
		
		list.forEach(cons);
		
		list.forEach(System.out::println);
		
	}

}
