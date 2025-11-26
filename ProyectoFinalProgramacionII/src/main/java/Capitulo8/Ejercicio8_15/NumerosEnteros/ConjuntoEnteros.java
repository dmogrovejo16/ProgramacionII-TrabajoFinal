package Capitulo8.Ejercicio8_15.NumerosEnteros;

public class ConjuntoEnteros {
	 private boolean[] a;

	 public ConjuntoEnteros() {
	  a = new boolean[101];
	 }

	 public static ConjuntoEnteros union(ConjuntoEnteros c1, ConjuntoEnteros c2) {
	  ConjuntoEnteros r = new ConjuntoEnteros();
	  for (int i=0;i<101;i++) {
	   r.a[i] = c1.a[i] || c2.a[i];
	  }
	  return r;
	 }

	 public static ConjuntoEnteros interseccion(ConjuntoEnteros c1, ConjuntoEnteros c2) {
	  ConjuntoEnteros r = new ConjuntoEnteros();
	  for (int i=0;i<101;i++) {
	   r.a[i] = c1.a[i] && c2.a[i];
	  }
	  return r;
	 }

	 public void insertarElemento(int k) {
	  if (k>=0 && k<=100) a[k] = true;
	 }

	 public void eliminarElemento(int m) {
	  if (m>=0 && m<=100) a[m] = false;
	 }

	 public String aStringConjunto() {
	  String s = "";
	  for (int i=0;i<101;i++) {
	   if (a[i]) s += i + " ";
	  }
	  if (s.equals("")) return "---";
	  return s;
	 }

	 public boolean esIgualA(ConjuntoEnteros c) {
	  for (int i=0;i<101;i++) {
	   if (a[i] != c.a[i]) return false;
	  }
	  return true;
	 }
}
