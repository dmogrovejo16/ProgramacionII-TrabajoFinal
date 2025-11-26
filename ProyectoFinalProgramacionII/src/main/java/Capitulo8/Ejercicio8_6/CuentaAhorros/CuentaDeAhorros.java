package Capitulo8.Ejercicio8_6.CuentaAhorros;

public class CuentaDeAhorros {
	private double saldoAhorros;
	 static double tasaInteresAnual;

	 public CuentaDeAhorros(double saldo) {
	  saldoAhorros = saldo;
	 }

	 public void calcularInteresMensual() {
	  double interes = saldoAhorros * tasaInteresAnual / 12;
	  saldoAhorros += interes;
	 }

	 public static void modificarTasaInteres(double nuevaTasa) {
	  tasaInteresAnual = nuevaTasa;
	 }

	 public double obtenerSaldo() {
	  return saldoAhorros;
	 }
}
