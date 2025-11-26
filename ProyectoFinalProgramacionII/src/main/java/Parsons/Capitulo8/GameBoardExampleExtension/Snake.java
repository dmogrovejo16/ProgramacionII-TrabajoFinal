package Parsons.Capitulo8.GameBoardExampleExtension;

public class Snake extends Mover{

	Snake(BoardSquare top, BoardSquare bottom)
	{
	super(top,bottom);
	}
	
	void movePlayerPiece(PlayerPiece counter)
	{
	System.out.println("Down the snake to " +
	getBottom().getPosition());
	counter.setCurrentPosition(getBottom());
	}
	
	public void getMover() {
		System.out.println("I am a Snake");
	}
	
	
}
