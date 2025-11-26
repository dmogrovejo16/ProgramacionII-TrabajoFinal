package Parsons.Capitulo8.ShapeExercise;

import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends TwoDimensionalShape{
public Rectangle(Point location, int height, int width) {
	super(location,height,width);
}

public double getArea()
{
    return this.getHeight()*this.getWidth();
}





public void draw(Graphics g)
{
    g.fillRect(getLocation().x-getWidth(), getLocation().y,
               getHeight(), getWidth());
}

public void draw2(Graphics g)
{
    g.fillRect(getLocation().x-getWidth(), getLocation().y,
    		getWidth(), getHeight());
}


}
