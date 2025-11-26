package Capitulo8.Ejercicio8_18.EnteroEnorme;

public class PruebaEnteroEnorme {
	 public static void main(String[] args) {
		  EnteroEnorme a = new EnteroEnorme("12345678901234567890");
		  EnteroEnorme b = new EnteroEnorme("99999999999999999999");

		  System.out.println("a = " + a);
		  System.out.println("b = " + b);

		  System.out.println("Suma = " + a.sumar(b));
		  System.out.println("Resta = " + b.restar(a));

		  System.out.println("a == b: " + a.esIgualA(b));
		  System.out.println("a != b: " + a.noEsIgualA(b));
		  System.out.println("a > b: " + a.esMayorQue(b));
		  System.out.println("a < b: " + a.esMenorQue(b));
		  System.out.println("a >= b: " + a.esMayorOIgualA(b));
		  System.out.println("a <= b: " + a.esMenorOIgualA(b));
		  System.out.println("a es cero: " + a.esCero());
		  System.out.println("Nuevo EnteroEnorme(\"0\") es cero: " + new EnteroEnorme("0").esCero());
		 }
}
