package gioco.test;

import gioco.ui.SuperPanel;

import javax.swing.JFrame;

public class MainTest {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		SuperPanel superPanel = new SuperPanel();
		
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(superPanel);
		frame.setVisible(true);
	}

}
