package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Libreria {

	private JFrame frame;

	

	/**
	 * Create the application.
	 */
	public Libreria() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
