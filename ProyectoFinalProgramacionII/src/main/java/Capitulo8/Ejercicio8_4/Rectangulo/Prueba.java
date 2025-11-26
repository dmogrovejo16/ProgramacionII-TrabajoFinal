package Capitulo8.Ejercicio8_4.Rectangulo;

public class Prueba {
	public static void main(String[] args) {
		  Rectangulo r = new Rectangulo();
		  System.out.println("Longitud: " + r.getLongitud());
		  System.out.println("Anchura: " + r.getAnchura());
		  System.out.println("Perimetro: " + r.perimetro());
		  System.out.println("Area: " + r.area());

		  r.setLongitud(5.5);
		  r.setAnchura(3.2);
		  System.out.println("Longitud: " + r.getLongitud());
		  System.out.println("Anchura: " + r.getAnchura());
		  System.out.println("Perimetro: " + r.perimetro());
		  System.out.println("Area: " + r.area());
		 }
}
