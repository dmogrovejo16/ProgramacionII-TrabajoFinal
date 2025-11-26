package Capitulo10.Ejercicio10_10.Figuras;

public class Triangulo extends FiguraBidimensional {
	 private double base;
	    private double altura;

	    public Triangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    @Override
	    public double obtenerArea() {
	        return (base * altura) / 2;
	    }

	    @Override
	    public String toString() {
	        return "Triángulo (base = " + base + ", altura = " + altura + ")";
	    }
}
