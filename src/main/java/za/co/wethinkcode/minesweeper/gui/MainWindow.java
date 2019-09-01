package za.co.wethinkcode.minesweeper.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {

	int cellsInRow = 30;
	int buttonSize = 30;
	int numCells = cellsInRow * cellsInRow;
	
	ArrayList<JButton> btns = new ArrayList<JButton>(numCells);
	
	public MainWindow() {
		super("Minesweeper");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setResizable(false);
		
		for (int i = 0; i < numCells; i++) {
			JButton btn = new JButton();
			// Change size of buttons
			btn.setPreferredSize(new Dimension(buttonSize, buttonSize));
			btn.setMargin(new Insets(0, 0, 0, 0));
			
			getContentPane().add(btn);
			btns.add(btn);						
		}
		
		// Figure out calculation
		getContentPane().setPreferredSize(new Dimension(cellsInRow * buttonSize, cellsInRow * buttonSize));
		pack();
		setVisible(true);		
	}	
}

