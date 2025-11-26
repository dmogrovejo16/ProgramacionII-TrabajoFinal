package Capitulo8.Ejercicio8_8.ModificacionFecha;

public class PruebaFecha {
	public static void main(String[] args) {
		  Fecha f1 = new Fecha(1,31,2024);
		  for(int i=0;i<2;i++) {
		   System.out.println(f1);
		   f1.siguienteDia();
		  }

		  Fecha f2 = new Fecha(12,31,2024);
		  for(int i=0;i<2;i++) {
		   System.out.println(f2);
		   f2.siguienteDia();
		  }
		 }
}
