package Capitulo10.Ejercicio10_12.ModificacionCuentasPagar;

public class PruebaInterfazPorPagar {
	public static void main( String args[] )
	 {
	 // crea arreglo PorPagar con cuatro elementos
	 PorPagar objetosPorPagar[] = new PorPagar[ 7 ];
	 
	  // llena el arreglo con objetos que implementan la interfaz PorPagar
	  objetosPorPagar[ 0 ] = new Factura( "01234", "asiento", 2, 375.00 );
	  objetosPorPagar[ 1 ] = new Factura( "56789", "llanta", 4, 79.95 );
	  objetosPorPagar[ 2 ] =
	  new EmpleadoAsalariado( "John", "Smith", "111-11-1111", 800.00 );
	  objetosPorPagar[ 3 ] =
	  new EmpleadoAsalariado( "Lisa", "Barnes", "888-88-8888", 1200.00 );
	  objetosPorPagar[ 4 ] =
			  new EmpleadoPorHoras( "Mario", "Barnes", "888-88-8888", 50.00 ,80);
	  objetosPorPagar[ 5 ] =
			  new EmpleadoPorComision( "Lucio", "Barnes", "888-88-8888", 100,6);
	  objetosPorPagar[ 6 ] =
			  new EmpleadoBaseMasComision( "Adan", "Barnes", "888-88-8888", 50,7.5,600);
	 
	  System.out.println(
	  "Facturas y Empleados procesados en forma polimorfica:\n" );
	 
	  // procesa en forma genérica cada elemento en el arreglo objetosPorPagar
	  for ( PorPagar porPagarActual : objetosPorPagar )
	  {
	  // imprime porPagarActual y su monto de pago apropiado
	  System.out.printf( "%s \n%s: $%,.2f\n\n",
	  porPagarActual.toString(),
	  "pago vencido", porPagarActual.obtenerMontoPago() );
	  } // fin de for
	  } // fin de mai
}
