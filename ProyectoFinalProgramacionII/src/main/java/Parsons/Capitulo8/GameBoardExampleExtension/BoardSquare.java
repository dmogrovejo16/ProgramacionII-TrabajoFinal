package Parsons.Capitulo8.GameBoardExampleExtension;

public class BoardSquare {
	
	public Mover amover=null;
	private int position;
	BoardSquare(int position) {
	setPosition(position);
	}
	public int getPosition() {
	return position;
	}
	private void setPosition(int position) {
	this.position = position;
	}
	// we may want to add a snake head
	void addSnake(Mover s) {
		amover = s;
	}
	// or add the foot of a ladder
	public void addLadder(Mover l) {
		amover = l;
	}
	// methods to find out if the square has a snake or a ladder
	private boolean hasSnake() {
	return null != amover;
	}
	private boolean hasLadder() {
	return null != amover;
	}
	public void movePlayerPiece(PlayerPiece counter) {
	counter.setCurrentPosition(this);
	if (hasSnake()) {
	
		amover.movePlayerPiece(counter);
	}
	if (hasLadder()) {
		amover.movePlayerPiece(counter);
	}
	}
	
	
	
}
