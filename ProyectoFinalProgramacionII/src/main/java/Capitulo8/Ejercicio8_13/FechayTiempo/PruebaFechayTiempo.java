package Capitulo8.Ejercicio8_13.FechayTiempo;

public class PruebaFechayTiempo {
	public static void main(String[] args) {

		  FechayTiempo ft = new FechayTiempo(31,12,2025,23,0,0);

		  System.out.println(ft.aStringEstandar());
		  ft.incrementarHora();
		  System.out.println(ft.aStringEstandar());

		  FechayTiempo ft2 = new FechayTiempo(1,1,2025,23,59,58);
		  System.out.println(ft2.aStringEstandar());
		  ft2.tictac();
		  ft2.tictac();
		  System.out.println(ft2.aStringEstandar());
		 }
}
