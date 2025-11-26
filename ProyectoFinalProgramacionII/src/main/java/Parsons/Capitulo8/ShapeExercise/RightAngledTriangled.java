package Parsons.Capitulo8.ShapeExercise;

import java.awt.Graphics;
import java.awt.Point;

public class RightAngledTriangled extends TwoDimensionalShape {
	
	public RightAngledTriangled(Point location, int dimension1, int dimension2){
super(location, dimension1, dimension2);
}

@Override
public double getArea()
{
return (this.getDimensions()[0]*this.getDimensions()[1]/2);
}

@Override
public void draw(Graphics g)
{
int xLocation = this.getLocation().x;
int yLocation = this.getLocation().y;
int[] xValues =
{xLocation, xLocation, xLocation + getWidth() };
int[] yValues = {yLocation, yLocation + getHeight(),
       yLocation + getHeight()};
g.fillPolygon(xValues, yValues, 3);
}

public void draw2(Graphics g){
int xLocation = this.getLocation().x;
int yLocation = this.getLocation().y;
int width = getDimensions()[0]; // base del triángulo
int height = getDimensions()[1]; // altura del triángulo, por si la usas

int[] xValues = {
    xLocation,               // esquina superior derecha
    xLocation,               // esquina inferior derecha
    xLocation - width        // punta hacia la izquierda
};

int[] yValues = {
    yLocation,               // parte superior
    yLocation + height,      // parte inferior
    yLocation + height       // parte inferior (punta)
};

g.fillPolygon(xValues, yValues, 3);
}
}

