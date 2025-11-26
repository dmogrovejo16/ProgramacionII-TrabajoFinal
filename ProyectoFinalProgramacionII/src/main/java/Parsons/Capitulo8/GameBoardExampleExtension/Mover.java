package Parsons.Capitulo8.GameBoardExampleExtension;

public abstract class Mover {
	private BoardSquare top;
	private BoardSquare bottom;
	public Mover(BoardSquare top, BoardSquare bottom) {	
		this.top = top;
        this.bottom = bottom;
		bottom.addLadder(this);
		top.addSnake(this);
	}
	
	public void setTop(BoardSquare top)
	{
	this.top = top;
	}
	public BoardSquare getTop()
	{
	return top;
	}
	
	public void setBottom(BoardSquare bottom)
	{
	this.bottom = bottom;
	}
	public BoardSquare getBottom()
	{
	return bottom;
	}
	abstract void movePlayerPiece(PlayerPiece counter);

	public abstract void getMover();
}
