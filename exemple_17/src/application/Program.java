/*
 * SWITCH CASE
 * HERANÇA
 * SOBRESCRITA DE MËTODO
 */
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shape = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Shape #" + (i+1) + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char value = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			switch(value) {
				case 'r': {
					System.out.print("Widht: ");
					Double widht = sc.nextDouble();
					System.out.print("Height: ");
					Double height = sc.nextDouble();
					shape.add(new Rectangle(color, widht, height));
					break;
				}
				case 'c': {
					System.out.print("Radius: ");
					Double radius = sc.nextDouble();
					shape.add(new Circle(color, radius));
					break;
				}
			}
			

		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for(Shape s: shape) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		
		sc.close();
	}

}
