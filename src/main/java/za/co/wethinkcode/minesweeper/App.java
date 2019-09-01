package za.co.wethinkcode.minesweeper;

import javax.swing.SwingUtilities;

import za.co.wethinkcode.minesweeper.game.Board;
import za.co.wethinkcode.minesweeper.gui.MainWindow;

public class App 
{
    public static void main( String[] args )
    {
    	
    	SwingUtilities.invokeLater(new StartGame());
    	
    	//Board b = new Board(10);
    	//b.printBoard();
    }
}

class StartGame implements Runnable {

	public void run() {
		new MainWindow();
	}
	
}
