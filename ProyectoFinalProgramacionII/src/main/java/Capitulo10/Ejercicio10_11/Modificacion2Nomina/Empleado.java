package Capitulo10.Ejercicio10_11.Modificacion2Nomina;

public abstract class Empleado {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	private Fecha fecha;
	 // constructor con tres argumentos
	 public Empleado( String nombre, String apellido, String nss, int dia, int mes, int anio )
	 {
	 primerNombre = nombre;
	 apellidoPaterno = apellido;
	 numeroSeguroSocial = nss;
	 fecha = new Fecha(dia,mes,anio);
	 } // fin del constructor de Empleado con tres argumentos
	
	 // establece el primer nombre
	 public void establecerPrimerNombre( String nombre )
	 {
	 primerNombre = nombre;
	 } // fin del método establecerPrimerNombre
	
	 // devuelve el primer nombre
	 public String obtenerPrimerNombre()

	  {
	  return primerNombre;
	  } // fin del método obtenerPrimerNombre
	 
	  // establece el apellido paterno
	  public void establecerApellidoPaterno( String apellido )
	  {
	  apellidoPaterno = apellido;
	  } // fin del método establecerApellidoPaterno
	 
	  // devuelve el apellido paterno
	  public String obtenerApellidoPaterno()
	  {
	  return apellidoPaterno;
	  } // fin del método obtenerApellidoPaterno
	 
	  // establece el número de seguro social
	  public void establecerNumeroSeguroSocial( String nss )
	  {
	  numeroSeguroSocial = nss; // debe validar
	  } // fin del método establecerNumeroSeguroSocial
	 
	  // devuelve el número de seguro social
	  public String obtenerNumeroSeguroSocial()
	  {
	  return numeroSeguroSocial;
	  } // fin del método obtenerNumeroSeguroSocial
	 
	  // devuelve representación String de un objeto Empleado
	  public String toString()
	  {
	  return String.format( "%s %s\nnumero de seguro social: %s",
	  obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial(),"%s %s\\ Fecha de nacimiento: %s", getFecha());
	  } // fin del método toString
	 
	  
	  
	  public Fecha getFecha() {
		return fecha;
	}

	  public void setFecha(Fecha fecha) {
		  this.fecha = fecha;
	  }

	  // método abstracto sobrescrito por las subclases
	  public abstract double ingresos(); // aquí no hay implementación
}
