package za.co.wethinkcode.minesweeper.game;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import za.co.wethinkcode.minesweeper.game.Cell.CellType;

public class Board {

	private List<List<Cell>> board;
	public int size;
	
	public Board(int size) {
		this.size = size;
		buildBoard();
		setMines();
	}
	
	private void buildBoard() {
		board = new ArrayList<List<Cell>>(size);
		
		for (int i = 0; i < size; i++) {
			board.add(new ArrayList<Cell>(size));
		}
		
		for (int i = 0; i < size; i++) {
			List<Cell> row = board.get(i);
			for (int j = 0; j < size; j++) {
				row.add(new Cell());
			}
		}
	}
	
	public void printBoard() {
		for (int i = 0; i < size; i++) {
			List<Cell> row = board.get(i);
			for (int j = 0; j < size; j++) {
				
				Cell current = row.get(j);
				
				if (current.type == CellType.FREE) {
					System.out.print("0 ");
				} else if (current.type == CellType.MINE) {
					System.out.print("1 ");
				} else if (current.type == CellType.CLICKED) {
					System.out.print("- ");
				} else if (current.type == CellType.FLAGGED) {
					System.out.print("! ");
				}
			}
			System.out.println();
		}
	}
	
	public void setMines() {
		// TODO: difficulty control here
		int numMines = size;
		
		// Potential overlap of mines
		for (int i = 0; i < numMines; i++) {
			int row = ThreadLocalRandom.current().nextInt(0, size);
			int col = ThreadLocalRandom.current().nextInt(0, size);
			
			board.get(row).get(col).setType(CellType.MINE);
		}
	}
	
}
