package Capitulo8.Ejercicio8_14.RectanguloMejorada;

public class PruebaRectangulo {
	public static void main(String[] args) {
		  Punto a = new Punto(2,2);
		  Punto b = new Punto(8,2);
		  Punto c = new Punto(8,5);
		  Punto d = new Punto(2,5);

		  Rectangulo r = new Rectangulo(a,b,c,d);

		  System.out.println("Longitud: " + r.getLongitud());
		  System.out.println("Anchura: " + r.getAnchura());
		  System.out.println("Perimetro: " + r.perimetro());
		  System.out.println("Area: " + r.area());
		  System.out.println("Es cuadrado: " + r.esCuadrado());

		  Punto e = new Punto(4,4);
		  Punto f = new Punto(8,4);
		  Punto g = new Punto(8,8);
		  Punto h = new Punto(4,8);

		  Rectangulo cuadrado = new Rectangulo(e,f,g,h);

		  System.out.println("\nSegundo rectángulo:");
		  System.out.println("Es cuadrado: " + cuadrado.esCuadrado());
		 }
}
