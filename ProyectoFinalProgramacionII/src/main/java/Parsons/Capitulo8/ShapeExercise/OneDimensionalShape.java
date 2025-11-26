package Parsons.Capitulo8.ShapeExercise;

import java.awt.Graphics;
import java.awt.Point;

public class OneDimensionalShape extends Shape{
public int getDimension() {
	return dimensions[0];
}

public void setDimensions(int[] dim) {
	if(dim.length==1) {
		super.setDimensions(dim);
	}
}


public OneDimensionalShape(Point location, int dimension) {
	super(location);
	int[] tempArray = {dimension};
	setDimensions(tempArray);
}


public void draw(Graphics g) {
	// TODO Auto-generated method stub
	
}


public double getArea() {
	// TODO Auto-generated method stub
	return 0;
}


}
