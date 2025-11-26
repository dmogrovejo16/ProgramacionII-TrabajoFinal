package Capitulo8.Ejercicio8_13.FechayTiempo;

public class FechayTiempo {
	private Fecha fecha;
	 private Tiempo tiempo;

	 public FechayTiempo(int d,int m,int a,int h,int min,int s) {
	  fecha = new Fecha(d,m,a);
	  tiempo = new Tiempo(h,min,s);
	 }

	 public void incrementarHora() {
	  boolean nuevoDia = tiempo.incrementarHora();
	  if (nuevoDia)
	   fecha.siguienteDia();
	 }

	 public void tictac() {
	  int h = tiempo.getHora();
	  tiempo.tictac();
	  if (h == 23 && tiempo.getHora() == 0)
	   fecha.siguienteDia();
	 }

	 public String aStringEstandar() {
	  return fecha.aString()+" "+tiempo.aStringEstandar();
	 }

	 public String aStringUniversal() {
	  return fecha.aString()+" "+tiempo.aStringUniversal();
	 }
}
