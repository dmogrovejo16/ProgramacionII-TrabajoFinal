package Capitulo8.Ejercicio8_9.Modificacion3Tiempo;

public class Tiempo {
	int segundos;

	 public Tiempo() {
	  this(0,0,0);
	 }

	 public Tiempo(int h) {
	  this(h,0,0);
	 }

	 public Tiempo(int h,int m) {
	  this(h,m,0);
	 }

	 public Tiempo(int h,int m,int s) {
	  if(!establecerTiempo(h,m,s)) segundos = 0;
	 }

	 public Tiempo(Tiempo t) {
	  this(t.obtenerHora(),t.obtenerMinuto(),t.obtenerSegundo());
	 }

	 public boolean establecerTiempo(int h,int m,int s) {
	  if(h<0||h>23) return false;
	  if(m<0||m>59) return false;
	  if(s<0||s>59) return false;
	  segundos = h*3600 + m*60 + s;
	  return true;
	 }

	 public boolean establecerHora(int h) {
	  if(h<0||h>23) return false;
	  int m = obtenerMinuto();
	  int s = obtenerSegundo();
	  segundos = h*3600 + m*60 + s;
	  return true;
	 }

	 public boolean establecerMinuto(int m) {
	  if(m<0||m>59) return false;
	  int h = obtenerHora();
	  int s = obtenerSegundo();
	  segundos = h*3600 + m*60 + s;
	  return true;
	 }

	 public boolean establecerSegundo(int s) {
	  if(s<0||s>59) return false;
	  int h = obtenerHora();
	  int m = obtenerMinuto();
	  segundos = h*3600 + m*60 + s;
	  return true;
	 }

	 public int obtenerHora() {
	  return segundos/3600;
	 }

	 public int obtenerMinuto() {
	  return (segundos%3600)/60;
	 }

	 public int obtenerSegundo() {
	  return segundos%60;
	 }

	 public void tictac() {
	  segundos = (segundos + 1) % 86400;
	 }

	 public void incrementarMinuto() {
	  segundos = (segundos + 60) % 86400;
	 }

	 public void incrementarHora() {
	  segundos = (segundos + 3600) % 86400;
	 }

	 public String aStringUniversal() {
	  return String.format("%02d:%02d:%02d",
	   obtenerHora(),obtenerMinuto(),obtenerSegundo());
	 }

	 public String toString() {
	  return String.format("%d:%02d:%02d %s",
	   ((obtenerHora()==0||obtenerHora()==12)?12:obtenerHora()%12),
	   obtenerMinuto(),obtenerSegundo(),
	   (obtenerHora()<12?"AM":"PM"));
	 }
}
