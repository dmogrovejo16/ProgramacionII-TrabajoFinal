package Capitulo8.Ejercicio8_13.FechayTiempo;

public class Tiempo {
	private int hora;
	 private int minuto;
	 private int segundo;

	 public Tiempo(int h,int m,int s) {
	  hora = h;
	  minuto = m;
	  segundo = s;
	 }

	 public void tictac() {
	  segundo++;
	  if (segundo == 60) {
	   segundo = 0;
	   incrementarMinuto();
	  }
	 }

	 public void incrementarMinuto() {
	  minuto++;
	  if (minuto == 60) {
	   minuto = 0;
	   incrementarHora();
	  }
	 }

	 public boolean incrementarHora() {
	  hora++;
	  if (hora == 24) {
	   hora = 0;
	   return true;
	  }
	  return false;
	 }

	 public String aStringEstandar() {
	  int h = (hora==0 || hora==12) ? 12 : hora%12;
	  String ampm = (hora<12) ? "AM":"PM";
	  return h+":"+minuto+":"+segundo+" "+ampm;
	 }

	 public String aStringUniversal() {
	  return hora+":"+minuto+":"+segundo;
	 }

	 public int getHora(){return hora;}
	 public int getMinuto(){return minuto;}
	 public int getSegundo(){return segundo;}
}
