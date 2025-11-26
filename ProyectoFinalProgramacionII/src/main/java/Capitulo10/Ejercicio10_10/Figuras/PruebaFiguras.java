package Capitulo10.Ejercicio10_10.Figuras;

public class PruebaFiguras {
	 public static void main(String[] args) {

	        Figura[] figuras = new Figura[] {
	            new Circulo(5),
	            new Cuadrado(4),
	            new Triangulo(3, 6),
	            new Esfera(4),
	            new Cubo(3),
	            new Tetraedo(2)
	        };

	        for (Figura figura : figuras) {
	            System.out.println("--------------------------------------");
	            System.out.println("Objeto: " + figura.toString());

	            if (figura instanceof FiguraBidimensional) {
	                FiguraBidimensional f = (FiguraBidimensional) figura;
	                System.out.println("Tipo: Bidimensional");
	                System.out.println("Área = " + f.obtenerArea());
	            }

	            else if (figura instanceof FiguraTridimensional) {
	                FiguraTridimensional f = (FiguraTridimensional) figura;
	                System.out.println("Tipo: Tridimensional");
	                System.out.println("Área superficial = " + f.obtenerArea());
	                System.out.println("Volumen = " + f.obtenerVolumen());
	            }
	        }

	        System.out.println("--------------------------------------");
	    }
}
