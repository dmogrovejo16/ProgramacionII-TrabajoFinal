package Capitulo8.Ejercicio8_9.Modificacion3Tiempo;

public class PruebaTiempo {
	 public static void main(String[] args) {
		  Tiempo t = new Tiempo(25,61,61);
		  System.out.println("Constructor con valores inválidos -> " + t.aStringUniversal());

		  Tiempo t2 = new Tiempo(10,20,30);
		  System.out.println("Inicial: " + t2.aStringUniversal());

		  boolean ok;

		  ok = t2.establecerHora(15);
		  System.out.println("establecerHora(15) -> " + (ok ? "ok" : "error") + " -> " + t2.aStringUniversal());

		  ok = t2.establecerHora(-1);
		  System.out.println("establecerHora(-1) -> " + (ok ? "ok" : "error") + " -> " + t2.aStringUniversal());

		  ok = t2.establecerMinuto(45);
		  System.out.println("establecerMinuto(45) -> " + (ok ? "ok" : "error") + " -> " + t2.aStringUniversal());

		  ok = t2.establecerMinuto(75);
		  System.out.println("establecerMinuto(75) -> " + (ok ? "ok" : "error") + " -> " + t2.aStringUniversal());

		  ok = t2.establecerSegundo(50);
		  System.out.println("establecerSegundo(50) -> " + (ok ? "ok" : "error") + " -> " + t2.aStringUniversal());

		  ok = t2.establecerSegundo(99);
		  System.out.println("establecerSegundo(99) -> " + (ok ? "ok" : "error") + " -> " + t2.aStringUniversal());

		  ok = t2.establecerTiempo(23,59,59);
		  System.out.println("establecerTiempo(23,59,59) -> " + (ok ? "ok" : "error") + " -> " + t2.aStringUniversal());
		  t2.tictac();
		  System.out.println("tictac -> " + t2.aStringUniversal());
		 }
}
