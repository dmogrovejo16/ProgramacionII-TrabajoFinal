package Capitulo8.Ejercicio8_4.Rectangulo;

public class Rectangulo {
	double longitud = 1;
	 double anchura = 1;

	 public Rectangulo() {}

	 public Rectangulo(double l, double a) {
	  setLongitud(l);
	  setAnchura(a);
	 }

	 public void setLongitud(double l) {
	  if(l > 0.0 && l < 20.0) longitud = l;
	 }

	 public void setAnchura(double a) {
	  if(a > 0.0 && a < 20.0) anchura = a;
	 }

	 public double getLongitud() {
	  return longitud;
	 }

	 public double getAnchura() {
	  return anchura;
	 }

	 public double perimetro() {
	  return 2 * (longitud + anchura);
	 }

	 public double area() {
	  return longitud * anchura;
	 }
}
