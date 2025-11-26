package Capitulo8.Ejercicio8_14.RectanguloMejorada;

public class Rectangulo {
	 private Punto p1, p2, p3, p4;
	 private double longitud;
	 private double anchura;

	 public Rectangulo(Punto a, Punto b, Punto c, Punto d) {
	  establecer(a,b,c,d);
	 }

	 private void establecer(Punto a, Punto b, Punto c, Punto d) {
	  if (!validar(a) || !validar(b) || !validar(c) || !validar(d))
	   throw new IllegalArgumentException("Coordenadas fuera del primer cuadrante o mayores a 20");

	  if (!formaRectangulo(a,b,c,d))
	   throw new IllegalArgumentException("Las coordenadas no forman un rectángulo");

	  p1 = a; p2 = b; p3 = c; p4 = d;

	  double lado1 = distancia(p1,p2);
	  double lado2 = distancia(p2,p3);

	  longitud = Math.max(lado1,lado2);
	  anchura = Math.min(lado1,lado2);
	 }

	 private boolean validar(Punto p) {
	  return p.x >= 0 && p.y >= 0 && p.x <= 20 && p.y <= 20;
	 }

	 private boolean formaRectangulo(Punto a, Punto b, Punto c, Punto d) {
	  double ab = distancia(a,b);
	  double bc = distancia(b,c);
	  double cd = distancia(c,d);
	  double da = distancia(d,a);

	  double diag1 = distancia(a,c);
	  double diag2 = distancia(b,d);

	  return ab>0 && bc>0 && cd>0 && da>0 && Math.abs(diag1-diag2)<0.0001;
	 }

	 private double distancia(Punto a,Punto b) {
	  return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
	 }

	 public double getLongitud() {
	  return longitud;
	 }

	 public double getAnchura() {
	  return anchura;
	 }

	 public double perimetro() {
	  return 2*(longitud+anchura);
	 }

	 public double area() {
	  return longitud*anchura;
	 }

	 public boolean esCuadrado() {
	  return Math.abs(longitud-anchura) < 0.0001;
	 }
	}

	class Punto {
	 public double x,y;

	 public Punto(double x,double y) {
	  this.x=x;
	  this.y=y;
	 }
}
