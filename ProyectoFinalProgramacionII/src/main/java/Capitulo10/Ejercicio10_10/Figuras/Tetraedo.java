package Capitulo10.Ejercicio10_10.Figuras;

public class Tetraedo extends FiguraTridimensional {
	  private double arista;

	    public Tetraedo(double arista) {
	        this.arista = arista;
	    }

	    @Override
	    public double obtenerArea() {
	        return Math.sqrt(3) * arista * arista;
	    }

	    @Override
	    public double obtenerVolumen() {
	        return (Math.pow(arista, 3)) / (6 * Math.sqrt(2));
	    }

	    @Override
	    public String toString() {
	        return "Tetraedro (arista = " + arista + ")";
	    }
}
