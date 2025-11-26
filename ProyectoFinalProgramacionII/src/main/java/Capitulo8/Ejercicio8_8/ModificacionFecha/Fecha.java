package Capitulo8.Ejercicio8_8.ModificacionFecha;

public class Fecha {
	private int mes;
	 private int dia;
	 private int anio;

	 public Fecha(int m,int d,int a) {
	  mes = comprobarMes(m);
	  anio = comprobarAnio(a);
	  dia = comprobarDia(d);
	 }

	 private int comprobarMes(int m) {
	  if(m>=1 && m<=12) return m;
	  return 1;
	 }

	 private int comprobarAnio(int a) {
	  if(a>=1) return a;
	  return 1;
	 }

	 private int comprobarDia(int d) {
	  int diasPorMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	  if(mes==2 && esBisiesto(anio)) diasPorMes[2] = 29;
	  if(d>=1 && d<=diasPorMes[mes]) return d;
	  return 1;
	 }

	 private boolean esBisiesto(int a) {
	  return a%400==0 || (a%4==0 && a%100!=0);
	 }

	 public void siguienteDia() {
	  int diasPorMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	  if(mes==2 && esBisiesto(anio)) diasPorMes[2] = 29;
	  dia++;
	  if(dia > diasPorMes[mes]) {
	   dia = 1;
	   mes++;
	   if(mes > 12) {
	    mes = 1;
	    anio++;
	   }
	  }
	 }

	 public String toString() {
	  return String.format("%d/%d/%d",mes,dia,anio);
	 }
}
