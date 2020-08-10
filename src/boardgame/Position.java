package boardgame;

public class Position {
	// Attributes
	private int row;
	private int column;

	// Builders
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	// Accessor Methods
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	// Methods
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
}
