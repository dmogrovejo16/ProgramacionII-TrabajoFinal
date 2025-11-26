package Parsons.Capitulo8.ShapeExercise;

import java.awt.Graphics;
import java.awt.Point;

public class EquilateralTriangle extends OneDimensionalShape {
	public EquilateralTriangle(Point location, int dimension1){
		super(location, dimension1);
		}
	
	
	public double getArea()
	{
	return ((Math.sqrt(3)/4)*this.getDimensions()[0]);
	}

	public void draw(Graphics g) {
		int xLocation = this.getLocation().x;
		int yLocation = this.getLocation().y;
		int[] xValues =
		{xLocation, xLocation, xLocation + getDimensions()[0] };
		int[] yValues = {yLocation, yLocation + getDimensions()[0],
		       yLocation + getDimensions()[0]};
		g.fillPolygon(xValues, yValues, 3);
	}
	
}
