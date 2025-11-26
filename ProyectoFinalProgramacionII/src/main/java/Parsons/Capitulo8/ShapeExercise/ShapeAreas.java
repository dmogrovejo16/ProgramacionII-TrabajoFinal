package Parsons.Capitulo8.ShapeExercise;

public class ShapeAreas {
	public static void main(String[] args)
	{
	    Shape[] shapes = {
	        new Square(null, 250),
	        new Rectangle(null, 25, 50),
	        new Oval(null, 20,10),
	        new Circle(null, 10),
	        new RoundedRectangle(null, 25, 50, 10),
	        new RightAngledTriangled(null, 100, 50),
	        new EquilateralTriangle(null,50)
	    };
	    
	    for (int i = 0; i < shapes.length; i++)
	    {
	        Shape shape = shapes[i];
	        System.out.println("The area of " +
	            shape.getClass().getSimpleName() +
	            " is " + shape.getArea());
	    }
	}
}
