package Capitulo8.Ejercicio8_17.Racional;

public class PruebaRacional {
	public static void main(String[] args) {
		  Racional r1 = new Racional(2,4);
		  Racional r2 = new Racional(3,9);

		  System.out.println("r1 = " + r1);
		  System.out.println("r2 = " + r2);

		  System.out.println("Suma = " + r1.sumar(r2));
		  System.out.println("Resta = " + r1.restar(r2));
		  System.out.println("Multiplicacion = " + r1.multiplicar(r2));
		  System.out.println("Division = " + r1.dividir(r2));

		  System.out.println("r1 flotante (5 decimales) = " + r1.aFlotante(5));
		  System.out.println("r2 flotante (2 decimales) = " + r2.aFlotante(2));
		 }
}
