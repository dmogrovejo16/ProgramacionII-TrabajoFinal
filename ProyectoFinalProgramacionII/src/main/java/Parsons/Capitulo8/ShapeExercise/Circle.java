package Parsons.Capitulo8.ShapeExercise;
import java.awt.Graphics;
import java.awt.Point;

public class Circle  extends OneDimensionalShape{

	
		public Circle(Point location, int radius) {
			super(location, radius);
			}
		
		public double getArea() {
			return(Math.PI*Math.pow(this.getDimension(), 2));
		}
		
		public void draw(Graphics g) {
			g.fillOval(getLocation().x, getLocation().y, getDimension(), getDimension());
		}
	
	
}
