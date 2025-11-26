package Parsons.Capitulo8.GameBoardExampleExtension;

public class Ladder extends Mover {

	Ladder(BoardSquare top, BoardSquare bottom)
	{
	super(top,bottom);
	}
	
	void movePlayerPiece(PlayerPiece counter)
	{
	System.out.println("Up the ladder to " +
	getTop().getPosition());
	counter.setCurrentPosition(getTop());
	}
	
	public void getMover() {
		System.out.println("I am a Ladder");
	}
}
