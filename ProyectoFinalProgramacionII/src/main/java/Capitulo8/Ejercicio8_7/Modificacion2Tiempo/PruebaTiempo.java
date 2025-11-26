package Capitulo8.Ejercicio8_7.Modificacion2Tiempo;

public class PruebaTiempo {
	public static void main(String[] args) {
		  Tiempo t = new Tiempo(10,59,58);
		  System.out.println(t.aStringUniversal());
		  t.tictac();
		  System.out.println(t.aStringUniversal());
		  t.tictac();
		  System.out.println(t.aStringUniversal());

		  Tiempo t2 = new Tiempo(3,59,10);
		  System.out.println(t2.aStringUniversal());
		  t2.incrementarMinuto();
		  System.out.println(t2.aStringUniversal());

		  Tiempo t3 = new Tiempo(7,20,30);
		  System.out.println(t3.aStringUniversal());
		  t3.incrementarHora();
		  System.out.println(t3.aStringUniversal());

		  Tiempo t4 = new Tiempo(23,59,58);
		  System.out.println(t4.aStringUniversal());
		  t4.tictac();
		  System.out.println(t4.aStringUniversal());
		  t4.tictac();
		  System.out.println(t4.aStringUniversal());
		 }
}
