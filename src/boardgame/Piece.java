package boardgame;

public abstract class Piece {
	// Attributes
	protected Position position;
	
	//Association
	private Board board;

	// Builders
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// Accessor methods
	protected Board getBoard() {
		return board;
	}

	// Methods
	/*
	public boolean[][] possibleMoves() {

	}
	
	public abstract boolean possibleMove(Position position);
	
	public boolean isThereAnyPossibleMove() {
		
	}
	*/

}
