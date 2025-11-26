package Parsons.Capitulo8.GameBoardExampleExtension;

import java.util.Random;

public class Die {

	 private Random random;
	    private static final int MIN_VALUE = 1;
	    private static final int MAX_VALUE = 6;
	    
	    // Constructor
	    public Die() {
	        random = new Random();
	    }
	    
	    // Método para lanzar el dado y obtener un número aleatorio entre 1 y 6
	    public int getRoll() {
	        return random.nextInt(MAX_VALUE) + MIN_VALUE;
	    }
}
