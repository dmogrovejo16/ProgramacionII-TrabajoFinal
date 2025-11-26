package Capitulo10.Ejercicio10_9.ModificacionNomina;

public class EmpleadoAsalariado extends Empleado {

	 private double salarioSemanal;
	 
	 // constructor de cuatro argumentos
	 public EmpleadoAsalariado( String nombre, String apellido, String nss,
	  double salario, int dia, int mes, int anio )
	  {
	  super( nombre, apellido, nss ,dia,mes,anio); // los pasa al constructor de Empleado
	  establecerSalarioSemanal( salario ); // valida y almacena el salario
	  } // fin del con
	 public void establecerSalarioSemanal( double salario )
	  {
	  salarioSemanal = salario < 0.0 ? 0.0 : salario;
	  } // fin del método establecerSalarioSemanal
	 
	  // devuelve el salario
	  public double obtenerSalarioSemanal()
	  {
	  return salarioSemanal;
	  } // fin del método obtenerSalarioSemanal
	 
	  // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
	  public double ingresos()
	  {
	  return obtenerSalarioSemanal();
	  } // fin del método ingresos
	 
	  // devuelve representación String de un objeto EmpleadoAsalariado
	  public String toString()
	  {
	  return String.format( "empleado asalariado: %s\n%s: $%,.2f",
	  super.toString(), "salario semanal", obtenerSalarioSemanal() );
	  } // fin del método toString
}
