package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	// Attributes
	private Color color;

	// Builders
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	// Accessor Methods
	public Color getColor() {
		return color;
	}

	// Methods

}
