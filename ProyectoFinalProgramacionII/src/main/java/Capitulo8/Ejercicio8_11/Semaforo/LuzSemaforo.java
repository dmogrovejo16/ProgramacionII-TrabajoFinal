package Capitulo8.Ejercicio8_11.Semaforo;

public enum LuzSemaforo {
	 ROJO(30),
	 VERDE(45),
	 AMARILLO(5);

	 private int duracion;

	 LuzSemaforo(int d) {
	  duracion = d;
	 }

	 public int getDuracion() {
	  return duracion;
	 }
}
