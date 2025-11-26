package Parsons.Capitulo7.GameBoardExample;

public class SnakesAndLadders {

	// reference to the GameBoard
	private GameBoard board;
	// the constructor creates the Board
	public SnakesAndLadders()
	{
	board = new GameBoard();
	}
	// this method acts as a controller for playing the game
	public void play()
	{
	PlayerPiece counter = new PlayerPiece("Red");
	PlayerPiece counter2 = new PlayerPiece("Blue");
	counter.setCurrentPosition(board.getStartSquare());
	counter2.setCurrentPosition(board.getStartSquare());
	// iterate until we reach the end (square 100)
	int moves1=0, moves2=0;
	while(counter.getCurrentPosition().getPosition()< GameBoard.MAX_SQUARES){
	board.movePlayerPiece(counter);
	moves1++;
	}
	
	
	
	while(counter2.getCurrentPosition().getPosition()< GameBoard.MAX_SQUARES){
		board.movePlayerPiece(counter2);
		moves2++;
		}
	
	System.out.println(counter.getColor() +
	" counter finished on " +
	counter.getCurrentPosition().getPosition());
	
	System.out.println(counter2.getColor() +
			" counter finished on " +
			counter2.getCurrentPosition().getPosition());
	
	if(moves1<moves2) {
	System.out.println("Player "+counter.getColor()+" won with "+moves1+" movements (Blue: "+moves2+")");
	}else {
		System.out.println("Player "+counter2.getColor()+" won with "+moves2+" movements (Red: "+moves1+")");
	}
	}
	// 'main' creates a 'SnakesAndLadders' object and
	// starts the game
	public static void main(String[] args)
	{
	SnakesAndLadders myGame = new SnakesAndLadders();
	myGame.play();
	}
}
