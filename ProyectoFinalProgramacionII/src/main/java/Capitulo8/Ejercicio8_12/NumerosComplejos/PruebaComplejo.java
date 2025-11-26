package Capitulo8.Ejercicio8_12.NumerosComplejos;

public class PruebaComplejo {
	 public static void main(String[] args) {
		  Complejo c1 = new Complejo(3.5, 2.7);
		  Complejo c2 = new Complejo(1.2, -4.8);

		  Complejo suma = c1.sumar(c2);
		  Complejo resta = c1.restar(c2);

		  System.out.println("c1 = " + c1.aString());
		  System.out.println("c2 = " + c2.aString());
		  System.out.println("Suma = " + suma.aString());
		  System.out.println("Resta = " + resta.aString());
		 }
}
