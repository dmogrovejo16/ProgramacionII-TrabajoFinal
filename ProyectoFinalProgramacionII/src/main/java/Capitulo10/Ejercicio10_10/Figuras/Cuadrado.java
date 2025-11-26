package Capitulo10.Ejercicio10_10.Figuras;

public class Cuadrado extends FiguraBidimensional {
	 private double lado;

	    public Cuadrado(double lado) {
	        this.lado = lado;
	    }

	    @Override
	    public double obtenerArea() {
	        return lado * lado;
	    }

	    @Override
	    public String toString() {
	        return "Cuadrado (lado = " + lado + ")";
	    }
}
