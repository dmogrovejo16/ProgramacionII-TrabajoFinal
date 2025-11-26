package Capitulo8.Ejercicio8_15.NumerosEnteros;

public class PruebaConjuntoEnteros {
	 public static void main(String[] args) {
		  ConjuntoEnteros c1 = new ConjuntoEnteros();
		  ConjuntoEnteros c2 = new ConjuntoEnteros();

		  c1.insertarElemento(1);
		  c1.insertarElemento(3);
		  c1.insertarElemento(5);

		  c2.insertarElemento(3);
		  c2.insertarElemento(4);
		  c2.insertarElemento(5);
		  c2.insertarElemento(10);

		  System.out.println("c1: " + c1.aStringConjunto());
		  System.out.println("c2: " + c2.aStringConjunto());

		  ConjuntoEnteros u = ConjuntoEnteros.union(c1,c2);
		  ConjuntoEnteros i = ConjuntoEnteros.interseccion(c1,c2);

		  System.out.println("Union: " + u.aStringConjunto());
		  System.out.println("Interseccion: " + i.aStringConjunto());

		  c1.eliminarElemento(3);
		  System.out.println("c1 despues de eliminar 3: " + c1.aStringConjunto());

		  System.out.println("c1 es igual a c2: " + c1.esIgualA(c2));

		  ConjuntoEnteros c3 = new ConjuntoEnteros();
		  System.out.println("c3 (vacio): " + c3.aStringConjunto());
		 }
}
