/*
 * INTERFACES
 * CLASSES ABSTRATAS
 * HERANÇA
 */
package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectagle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbstractShape ab1 = new Circle(Color.BLACK, 2.0);
		AbstractShape ab2 = new Rectagle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Cicle color: " + ab1.getColor());
		System.out.println("Cicle area: " + String.format("%.3f", ab1.area()));
		System.out.println("Rectangle color: " + ab2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", ab2.area()));
		
	}

}
