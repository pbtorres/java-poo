package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "/Users/PabloTorres/Documents/in.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Employee> list = new ArrayList<>();
			
			String line;
			while((line = br.readLine()) != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				
			}
			
			System.out.print("Enter salary Filter: ");
			Double salaryFilter = sc.nextDouble();
			
			//Listando emails de funcionáios com salário acima do valor digitado
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryFilter) + ":");
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salaryFilter)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			
			//Mostrando a soma dos salários dos funcionários cujo nome começa com a letra 'M'
			Double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
		}
		catch(IOException e) {
			System.out.println("Error:" + e.getMessage());
		}
		
		sc.close();
	}
}
