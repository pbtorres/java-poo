package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] rooms = new Room[10];

		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("E-mail: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			
			for (int j=0; j<rooms.length; j++) {
				if(j == room) {	
					rooms[j] = new Room(name, email, room); 
				}
			}
		}
		
		for (int  i=0; i<rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(rooms[i].getRoom() +": " + 
						           rooms[i].getName() + ", " +
				                   rooms[i].getEmail());
			}
		}
		
		sc.close();
	}

}
