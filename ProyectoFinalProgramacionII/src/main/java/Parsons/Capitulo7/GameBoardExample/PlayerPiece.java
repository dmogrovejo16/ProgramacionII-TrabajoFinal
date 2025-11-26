package Parsons.Capitulo7.GameBoardExample;

public class PlayerPiece {
	private String color;
	private BoardSquare currentPosition;
    
    // Constructor
    
    public PlayerPiece (String color){
    	this.color=color;
    }
    
    // Getter para la posición actual
    public BoardSquare getCurrentPosition() {
        return currentPosition;
    }
    
    // Setter para la posición actual 
    void setCurrentPosition(BoardSquare newPosition) {
        this.currentPosition = newPosition;
    }
    
    
    // Método para obtener el número de posición actual
    public int getCurrentPositionNumber() {
        return currentPosition.getPosition();
    }
    
    // Método para mover la pieza a una nueva casilla
    public void moveTo(BoardSquare square) {
        square.movePlayerPiece(this);
    }
    
    public String getColor() {
		return color;
	}
    
    @Override
    public String toString() {
        return color + " está en la posición " + getCurrentPositionNumber();
    }


}
