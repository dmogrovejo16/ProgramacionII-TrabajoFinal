package Capitulo8.Ejercicio8_5.ModificacionTiempo;

public class PruebaTiempo {
	public static void main(String[] args) {
		  Tiempo t1 = new Tiempo();
		  System.out.println(t1.aStringUniversal());
		  System.out.println(t1.toString());

		  Tiempo t2 = new Tiempo(13);
		  System.out.println(t2.aStringUniversal());
		  System.out.println(t2.toString());

		  Tiempo t3 = new Tiempo(13, 27);
		  System.out.println(t3.aStringUniversal());
		  System.out.println(t3.toString());

		  Tiempo t4 = new Tiempo(13, 27, 6);
		  System.out.println(t4.aStringUniversal());
		  System.out.println(t4.toString());

		  t4.establecerHora(20);
		  t4.establecerMinuto(50);
		  t4.establecerSegundo(33);
		  System.out.println(t4.aStringUniversal());
		  System.out.println(t4.toString());
		 }
}
