package Parsons.Capitulo8.ShapeExercise;

import java.awt.Point;

public class AppTwoDimensionalShapes {

	public static void main(String[] args) {
		Point point = new Point(12,15);
		int[] dim= {2};
		Rectangle rectangle = new Rectangle(point, 10, 8);
		rectangle.setDimensions(dim);
		System.out.println("La altura es " + rectangle.getHeight()+ " y su ancho es "+rectangle.getWidth());
	}
	
}
