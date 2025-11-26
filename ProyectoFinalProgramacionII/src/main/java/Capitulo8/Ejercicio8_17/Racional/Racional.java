package Capitulo8.Ejercicio8_17.Racional;

public class Racional {
	private int num;
	 private int den;

	 public Racional() {
	  num = 0;
	  den = 1;
	 }

	 public Racional(int n,int d) {
	  if (d == 0) d = 1;
	  if (d < 0) {
	   n = -n;
	   d = -d;
	  }
	  int g = gcd(Math.abs(n),Math.abs(d));
	  num = n/g;
	  den = d/g;
	 }

	 private int gcd(int a,int b) {
	  while (b != 0) {
	   int t = b;
	   b = a % b;
	   a = t;
	  }
	  return a;
	 }

	 public Racional sumar(Racional r) {
	  int n = num*r.den + den*r.num;
	  int d = den * r.den;
	  return new Racional(n,d);
	 }

	 public Racional restar(Racional r) {
	  int n = num*r.den - den*r.num;
	  int d = den * r.den;
	  return new Racional(n,d);
	 }

	 public Racional multiplicar(Racional r) {
	  int n = num * r.num;
	  int d = den * r.den;
	  return new Racional(n,d);
	 }

	 public Racional dividir(Racional r) {
	  int n = num * r.den;
	  int d = den * r.num;
	  return new Racional(n,d);
	 }

	 public String aFraccion() {
	  return num + "/" + den;
	 }

	 public String aFlotante(int precision) {
	  return String.format("%." + precision + "f", (double)num/den);
	 }

	 public String toString() {
	  return aFraccion();
	 }
}
