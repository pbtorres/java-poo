package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file .csv path:");
		String path = sc.nextLine();
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Product> list = new ArrayList<>();
			
			String line;
			while((line = br.readLine()) != null) {
				String fields[];
				fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
			}
			
			double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / list.size();
			
			System.out.println("Average price: R$" + String.format("%.2f", avg));
			
			
			Comparator<String> comp = 
					(s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase()); //criando um comparator para comparar
			
			List<String> names = list.stream() //convertendo list para stream
					.filter(x -> x.getPrice() < avg) //filtrando os produtos com preco menor que a média
					.map(x -> x.getName()) // optendo todos os nomes da lista
					.sorted(comp.reversed()) // listando os nomes em ordem decrescente
					.collect(Collectors.toList()); //convertendo a stream pra lista
			
			names.forEach(System.out::println);
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}
