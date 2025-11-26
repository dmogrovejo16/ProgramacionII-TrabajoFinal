package Capitulo8.Ejercicio8_16.Fecha;

public class PruebaFecha {
	 public static void main(String[] args) {

		  Fecha f1 = new Fecha(6,15,1992);
		  Fecha f2 = new Fecha("Junio",15,1992);
		  Fecha f3 = new Fecha(167,1992);

		  System.out.println(f1.formato1());
		  System.out.println(f1.formato2());
		  System.out.println(f1.formato3());

		  System.out.println(f2.formato1());
		  System.out.println(f2.formato2());
		  System.out.println(f2.formato3());

		  System.out.println(f3.formato1());
		  System.out.println(f3.formato2());
		  System.out.println(f3.formato3());
		 }
}
