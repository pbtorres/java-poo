package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n ; i++) {
			sc.nextLine();
			System.out.println("Employee # "+ (i + 1 ) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(employees, id)) {
				System.out.print("this id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			employees.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will be salary increase: ");
		int idIncrease = sc.nextInt();
		
		Employee emp = employees.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

		//Integer pos = position(employees, idIncrease);
		
		if(emp == null) 
			System.out.println("This id does not exist!");
		else {
			System.out.print("Enter the percentage:: ");
			double percentage = sc.nextDouble();
			emp.increaSalary(percentage);
		}
		
		System.out.println("List of employees:");
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		sc. close();
	}
	
	public static Integer position (List<Employee> employees, int id) {
		for(int i=0; i<employees.size(); i++) {
			if(employees.get(i).getId() == id)
				return i;
		}
		return null;
	}
	public static boolean hasId(List<Employee> employess, int id) {
		Employee emp = employess.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
