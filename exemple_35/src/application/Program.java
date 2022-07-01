package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>(); // Curse a
		Set<Integer> b = new HashSet<>(); // Curse b
		Set<Integer> c = new HashSet<>(); // Curse c

		System.out.printf("How many students for curse A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			a.add(number);
		}

		System.out.printf("How many students for curse B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			b.add(number);
		}
		
		System.out.printf("How many students for curse C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			c.add(number);
		}

		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		
		System.out.println("Students from A:");
		System.out.println(a);
		
		System.out.println("Students from B:");
		System.out.println(b);
		
		System.out.println("Students from C:");
		System.out.println(c);
		
		
		System.out.println("Total students: " + total.size());

		sc.close();

	}

}
