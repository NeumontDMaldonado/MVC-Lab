package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Tabs panel = new Tabs();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
}