package za.co.wethinkcode.minesweeper.game;

public class Cell {

	CellType type;
	
	public Cell() {
		type = CellType.FREE;
	}
	
	public static enum CellType {		
		FREE,
		MINE,
		FLAGGED,
		CLICKED
	}
	
	public void setType(CellType type) {
		this.type = type;
	}
	
}
