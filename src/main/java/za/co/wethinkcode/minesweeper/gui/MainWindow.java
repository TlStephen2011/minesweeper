package za.co.wethinkcode.minesweeper.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {

	int cellsInRow = 10;
	int buttonSize = 30;
	int numCells = cellsInRow * cellsInRow;
	
	ArrayList<JButton> btns = new ArrayList<JButton>(numCells);
	
	public MainWindow() {
		super("Minesweeper");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setResizable(false);
		
		for (int i = 0; i < numCells; i++) {
			final JButton btn = new JButton();
			// Change size of buttons
			btn.setPreferredSize(new Dimension(buttonSize, buttonSize));
			btn.setMargin(new Insets(0, 0, 0, 0));
			btn.setFocusPainted(false);
			
			//TODO: might remove
			btn.setFont(new Font("Arial", Font.PLAIN, 18));
			
			btn.addMouseListener(new MouseAdapter(){

				@Override
				public void mouseReleased(MouseEvent e) {
					if (SwingUtilities.isRightMouseButton(e)) {
						btn.setText("!");
					} else {
						btn.setText("-");
					}
				}
				
	        });
			
			getContentPane().add(btn);
			btns.add(btn);						
		}
		
		getContentPane().setPreferredSize(new Dimension(cellsInRow * buttonSize, cellsInRow * buttonSize));
		pack();
		setVisible(true);		
	}	
}

