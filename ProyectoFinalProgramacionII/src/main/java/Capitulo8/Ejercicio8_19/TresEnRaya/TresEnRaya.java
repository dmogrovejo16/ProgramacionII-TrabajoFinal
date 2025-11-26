package Capitulo8.Ejercicio8_19.TresEnRaya;

import java.util.Scanner;

public class TresEnRaya {
	private int[][] tablero; // 3x3

    public TresEnRaya() {
        tablero = new int[3][3]; // inicializa en 0
    }

    // Muestra el tablero en consola
    public void mostrarTablero() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                char simbolo = tablero[i][j] == 0 ? ' ' : (tablero[i][j] == 1 ? 'X' : 'O');
                System.out.print(" " + simbolo + " |");
            }
            System.out.println(" ");
            System.out.println("-------------");
        }
    }

    // Realiza un movimiento. Jugador = 1 o 2. Regresa true si es válido.
    public boolean mover(int jugador, int fila, int columna) {
        if (fila < 0 || fila > 2 || columna < 0 || columna > 2)
            return false;

        if (tablero[fila][columna] != 0)
            return false;

        tablero[fila][columna] = jugador;
        return true;
    }

    // Evalúa si un jugador ganó
    public boolean hayGanador(int jugador) {
        // filas
        for (int i = 0; i < 3; i++)
            if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador)
                return true;

        // columnas
        for (int j = 0; j < 3; j++)
            if (tablero[0][j] == jugador && tablero[1][j] == jugador && tablero[2][j] == jugador)
                return true;

        // diagonales
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador)
            return true;

        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)
            return true;

        return false;
    }

    // Evalúa si el tablero está lleno (empate)
    public boolean tableroLleno() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tablero[i][j] == 0)
                    return false;
        return true;
    }

    // Programa de prueba
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        TresEnRaya juego = new TresEnRaya();

        int jugador = 1; // el jugador 1 empieza

        while (true) {
            juego.mostrarTablero();
            System.out.println("Jugador " + jugador + " ("
                    + (jugador == 1 ? "X" : "O") + "), ingrese fila y columna (0-2):");

            int fila = entrada.nextInt();
            int columna = entrada.nextInt();

            if (!juego.mover(jugador, fila, columna)) {
                System.out.println("Movimiento inválido. Intente de nuevo.");
                continue;
            }

            if (juego.hayGanador(jugador)) {
                juego.mostrarTablero();
                System.out.println("Jugador " + jugador + " ha ganado");
                break;
            }

            if (juego.tableroLleno()) {
                juego.mostrarTablero();
                System.out.println("Empate");
                break;
            }

            // cambia de jugador
            jugador = (jugador == 1) ? 2 : 1;
        }

        entrada.close();
    }
}
