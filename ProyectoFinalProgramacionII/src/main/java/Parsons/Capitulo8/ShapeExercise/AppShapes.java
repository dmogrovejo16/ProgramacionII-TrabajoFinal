package Parsons.Capitulo8.ShapeExercise;

import java.awt.Point;

public class AppShapes {

	public static void main(String [] args) {
		Point punto = new Point (5,2);
		int[] dim = {1};
		Circle circle = new Circle(punto,5);
		circle.setDimensions(dim);
		System.out.println("La dimension es: "+circle.getDimension());
	} 
	
}
