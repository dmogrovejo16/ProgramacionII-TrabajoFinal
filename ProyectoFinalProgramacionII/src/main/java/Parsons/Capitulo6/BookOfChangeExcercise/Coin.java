package Parsons.Capitulo6.BookOfChangeExcercise;

public class Coin {

	public Coin() {
	}
	
	public String getFace() {
		double random = Math.random();
		String face;
		if (random<0.5) {
			face = "Heads";
		}else {
			face="Tails";
		}
		
		return face;
	}
	
}