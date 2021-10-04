package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Declaring a string List
		List<String> list = new ArrayList<>(); 
		
		//Adding elements to list
		list.add("Torres"); 
		list.add("Ribeiro");
		list.add("Pablo");
		list.add(2,"Maura");

		//Showing all elements of list using foreach
		for (String l : list) {
			System.out.println(l);
		}
		System.out.println("----------------------");
		
		//Removing Pablo element of list
		list.remove("Pablo");
		
		//Showing all elements of list using foreach
		for (String l : list) {
			System.out.println(l);
		}	
		System.out.println("----------------------");

		//Sorting the list by name
		Collections.sort(list);
		
		//Deleting elements that begin with 'M'
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(list);
		System.out.println("----------------------");

		
		//Showing list size
		System.out.println("Size of list: " + list.size());
		System.out.println("----------------------");
		System.out.println("Index of Ribeiro: " + list.indexOf("Ribeiro"));
		System.out.println("Index of Pablo: " + list.indexOf("Pablo")); //not found return -1
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
		System.out.println(result);
		
		
	}
}
