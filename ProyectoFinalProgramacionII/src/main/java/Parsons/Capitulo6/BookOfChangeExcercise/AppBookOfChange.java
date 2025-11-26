package Parsons.Capitulo6.BookOfChangeExcercise;

import java.util.Vector;

public class AppBookOfChange {
public static void main(String[] args) {
	Coin coin = new Coin();
	var face1 = coin.getFace();
	var face2 = coin.getFace();
	var face3 = coin.getFace();
	
	Vector coinObjects = new Vector();
	coinObjects.add(face1);
	coinObjects.add(face2);
	coinObjects.add(face3);
	
	Hexagram hexagram = new Hexagram();
	System.out.println(hexagram.getHexagramLine(coinObjects));
}
}
