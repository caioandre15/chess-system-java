package boardgame;

public abstract class Piece {
	// Attributes
	protected Position position;

	// Association
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
	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
