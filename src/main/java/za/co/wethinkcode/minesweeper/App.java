package za.co.wethinkcode.minesweeper;

import za.co.wethinkcode.minesweeper.game.Board;

public class App 
{
    public static void main( String[] args )
    {
    	Board b = new Board(10);
    	b.printBoard();
    }
}
