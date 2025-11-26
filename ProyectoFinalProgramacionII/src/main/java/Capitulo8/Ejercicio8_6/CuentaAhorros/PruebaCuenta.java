package Capitulo8.Ejercicio8_6.CuentaAhorros;

public class PruebaCuenta {
	 public static void main(String[] args) {
		  CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
		  CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

		  CuentaDeAhorros.modificarTasaInteres(0.04);
		  ahorrador1.calcularInteresMensual();
		  ahorrador2.calcularInteresMensual();
		  System.out.println("Ahorrador 1: " + ahorrador1.obtenerSaldo());
		  System.out.println("Ahorrador 2: " + ahorrador2.obtenerSaldo());

		  CuentaDeAhorros.modificarTasaInteres(0.05);
		  ahorrador1.calcularInteresMensual();
		  ahorrador2.calcularInteresMensual();
		  System.out.println("Ahorrador 1: " + ahorrador1.obtenerSaldo());
		  System.out.println("Ahorrador 2: " + ahorrador2.obtenerSaldo());
		 }
}
