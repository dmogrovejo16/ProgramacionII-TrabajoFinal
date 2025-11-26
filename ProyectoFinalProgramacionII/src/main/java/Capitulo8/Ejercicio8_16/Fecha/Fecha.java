package Capitulo8.Ejercicio8_16.Fecha;

public class Fecha {
	 private int mes;
	 private int dia;
	 private int anio;

	 private static String[] nombresMes = {
	  "", "Enero","Febrero","Marzo","Abril","Mayo","Junio",
	  "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"
	 };

	 private static int[] diasMes = {
	  0,31,28,31,30,31,30,31,31,30,31,30,31
	 };

	 public Fecha(int m,int d,int a) {
	  mes = m;
	  dia = d;
	  anio = a;
	 }

	 public Fecha(String nombreMes,int d,int a) {
	  mes = convertirMes(nombreMes);
	  dia = d;
	  anio = a;
	 }

	 public Fecha(int diaDelAnio,int a) {
	  anio = a;
	  int m = 1;
	  int dd = diaDelAnio;

	  if (esBisiesto(a)) diasMes[2] = 29;
	  else diasMes[2] = 28;

	  while (dd > diasMes[m]) {
	   dd -= diasMes[m];
	   m++;
	  }
	  mes = m;
	  dia = dd;
	 }

	 private boolean esBisiesto(int a) {
	  return (a%400==0)||(a%4==0&&a%100!=0);
	 }

	 private int convertirMes(String nombre) {
	  for (int i=1;i<13;i++) {
	   if (nombresMes[i].equals(nombre)) return i;
	  }
	  return 1;
	 }

	 public String formato1() {
	  return String.format("%02d/%02d/%04d",mes,dia,anio);
	 }

	 public String formato2() {
	  return nombresMes[mes] + " " + dia + ", " + anio;
	 }

	 public String formato3() {
	  int total = dia;
	  if (esBisiesto(anio)) diasMes[2] = 29;
	  else diasMes[2] = 28;
	  for(int i=1;i<mes;i++) total += diasMes[i];
	  return total + " " + anio;
	 }

	 public String toString() {
	  return formato1()+" | "+formato2()+" | "+formato3();
	 }
}
