package Capitulo10.Ejercicio10_11.Modificacion2Nomina;

public class Fecha {
	private int dia;
	 private int mes;
	 private int anio;

	 public Fecha(int d,int m,int a) {
	  dia = d;
	  mes = m;
	  anio = a;
	 }

	 public void siguienteDia() {
	  dia++;
	  if (dia > diasEnMes(mes,anio)) {
	   dia = 1;
	   mes++;
	   if (mes > 12) {
	    mes = 1;
	    anio++;
	   }
	  }
	 }

	 private int diasEnMes(int m,int a) {
	  switch(m) {
	   case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	    return 31;
	   case 4: case 6: case 9: case 11:
	    return 30;
	   case 2:
	    if ((a%400==0)||(a%4==0&&a%100!=0))
	     return 29;
	    else
	     return 28;
	  }
	  return 30;
	 }

	 public String aString() {
	  return dia+"/"+mes+"/"+anio;
	 }
}
