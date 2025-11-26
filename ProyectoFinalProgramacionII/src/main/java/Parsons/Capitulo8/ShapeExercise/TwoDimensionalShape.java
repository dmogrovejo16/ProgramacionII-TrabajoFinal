package Parsons.Capitulo8.ShapeExercise;

import java.awt.Graphics;
import java.awt.Point;

public class TwoDimensionalShape extends Shape implements Transformable{
	public TwoDimensionalShape(Point location,
            int dimension1, int dimension2)
{
super(location);
int[] tempArray = {dimension1, dimension2};
setDimensions(tempArray);
}

public int getHeight()
{
return dimensions[0];
}

public int getWidth()
{
return dimensions[1];
}

public void setDimensions(int[] dim)
{
if (dim.length == 2) {
super.setDimensions(dim);
}
}

@Override
public double getArea() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void draw(Graphics g) {
	// TODO Auto-generated method stub
	
}

public void draw2(Graphics g) {
	// TODO Auto-generated method stub
	
}


public void switchDimensions() {
	int temp = dimensions[0];
	dimensions[0]=dimensions[1];
	dimensions[1]=temp;
	
}

public void rotateShape() {
	
	getLocation().x=-getLocation().x;	
	getLocation().y=-getLocation().y;	
}





}
