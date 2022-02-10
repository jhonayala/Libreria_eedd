package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBounds(100, 100, 936, 735);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEstanterias = new JLabel("ESTANTERIAS");
		lblEstanterias.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblEstanterias.setBounds(264, 43, 353, 71);
		frame.getContentPane().add(lblEstanterias);
		
		JButton btnEstan_Matematicas = new JButton("Matematicas");
		btnEstan_Matematicas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEstan_Matematicas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEstan_Matematicas.setBounds(113, 207, 147, 45);
		frame.getContentPane().add(btnEstan_Matematicas);
		
		JButton btnEstan_Idiomas = new JButton("Idiomas");
		btnEstan_Idiomas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEstan_Idiomas.setBounds(342, 347, 147, 45);
		frame.getContentPane().add(btnEstan_Idiomas);
		
		JButton btnEstan_Historia = new JButton("Historia");
		btnEstan_Historia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEstan_Historia.setBounds(546, 207, 147, 45);
		frame.getContentPane().add(btnEstan_Historia);
	}

}
