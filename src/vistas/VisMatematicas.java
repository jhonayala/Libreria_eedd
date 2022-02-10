package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import models.Estanteria;

public class VisMatematicas {

	private JFrame frame;
	private Estanteria matematicas;

	/**
	 * Create the application.
	 */
	public VisMatematicas() {
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
		frame.getContentPane().setLayout(null);
	}

}
