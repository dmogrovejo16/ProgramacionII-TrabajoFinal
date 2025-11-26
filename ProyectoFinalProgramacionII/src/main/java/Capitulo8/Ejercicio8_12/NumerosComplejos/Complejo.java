package Capitulo8.Ejercicio8_12.NumerosComplejos;

public class Complejo {
	private double real;
	 private double imag;

	 public Complejo() {
	  real = 0;
	  imag = 0;
	 }

	 public Complejo(double r,double i) {
	  real = r;
	  imag = i;
	 }

	 public Complejo sumar(Complejo c) {
	  return new Complejo(real + c.real, imag + c.imag);
	 }

	 public Complejo restar(Complejo c) {
	  return new Complejo(real - c.real, imag - c.imag);
	 }

	 public String aString() {
	  return "(" + real + ", " + imag + ")";
	 }
}
