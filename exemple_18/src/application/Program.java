package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> person = new ArrayList<>();
		
		System.out.print("Enter taxpayers number: ");
		int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			
			System.out.print("Physical Person/Legal Person? (P/L): ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			
			switch(type) {
				case 'P': {
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Annual Income: ");
					Double annualIcome = sc.nextDouble();
					System.out.print("Health Spending: ");
					Double healthSpedinding = sc.nextDouble();
					
					person.add(new PhysicalPerson(name, annualIcome, healthSpedinding));
					break;
				}
				case 'L': {
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Annual Income: ");
					Double annualIcome = sc.nextDouble();
					System.out.print("Employee Number: ");
					int employeeNumber = sc.nextInt();
					
					person.add(new LegalPerson(name, annualIcome, employeeNumber));
					break;
				} 
			}

		}
		System.out.println();
		System.out.println("TAXES PAID:");
		
		
		for(Person p : person) {
			System.out.println(p.getName() + ": " + "$" + String.format("%.2f", p.calculationTax()));
	
		}
		
		double sumTax = 0.0;
		for(Person p : person) {
			sumTax += p.calculationTax();
		}
		
		System.out.println();
		System.out.print("TAXES PAID: " + "$" + String.format("%.2f", sumTax));
		sc.close();
	}

}
