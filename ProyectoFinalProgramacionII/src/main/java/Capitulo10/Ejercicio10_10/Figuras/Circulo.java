package Capitulo10.Ejercicio10_10.Figuras;

public class Circulo extends FiguraBidimensional {
	private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Círculo (radio = " + radio + ")";
    }
}
