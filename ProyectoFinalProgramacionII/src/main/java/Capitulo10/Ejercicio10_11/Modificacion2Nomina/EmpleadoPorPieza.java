package Capitulo10.Ejercicio10_11.Modificacion2Nomina;

public class EmpleadoPorPieza extends Empleado{
	private double sueldoPagar; // porcentaje de comisión
	
	// constructor con cinco argumentos
	 public EmpleadoPorPieza( String nombre, String apellido, String nss,
	 double sueldo, int piezas, int dia, int mes, int anio )
	 {
	 super( nombre, apellido, nss,dia,mes,anio );

	 establecerSalario( sueldo, piezas );
	 } // fin del constructor de EmpleadoPorComision con cinco argumentos
	
	 // establece la tarifa de comisión
	 public void establecerSalario( double sueldo, int piezas )
	 {
	 sueldoPagar = sueldo*piezas;
	 } // fin del método establecerTarifaComision
	
	
	 // establece el monto de ventas brutas
	 
	 // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
	 public double ingresos()
	 {
	 return sueldoPagar;
	 } // fin del método ingresos
	
	 // devuelve representación String de un objeto EmpleadoPorComision
	 public String toString()
	 {
	 return String.format( "%s: %s\n%s: $%,.2f;",
	 "empleado por comision", super.toString(),
	 "Sueldo total", sueldoPagar );
	 } // fin del método toString
}
