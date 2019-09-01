package za.co.wethinkcode.minesweeper.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {

	int gridSize = 100;
	
	ArrayList<JButton> btns = new ArrayList<JButton>(gridSize);
	
	public MainWindow() {
		super("Minesweeper");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setResizable(false);
		
		for (int i = 0; i < gridSize; i++) {
			JButton btn = new JButton();
			// Change size of buttons
			btn.setPreferredSize(new Dimension(30, 30));
			btn.setMargin(new Insets(0, 0, 0, 0));
			
			getContentPane().add(btn);
			btns.add(btn);						
		}
		
		// Figure out calculation
		setSize(new Dimension(306, 300 + 30));
		setVisible(true);
	}	
}

