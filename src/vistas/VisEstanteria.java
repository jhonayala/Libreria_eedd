package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import models.Estanteria;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VisEstanteria {

	private JFrame frame;
	private Estanteria estanteria;
	private JTextField textTituloLi;
	private JTextField textCodigoLi;
	private JTextField textAutorLi;
	private JTextField textDispponibleLi;

	/**
	 * Create the application.
	 */
	public VisEstanteria(String n) {
		initialize();
		estanteria= new Estanteria(n);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 762, 636);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textTituloLi = new JTextField();
		textTituloLi.setEditable(false);
		textTituloLi.setBounds(199, 203, 265, 33);
		frame.getContentPane().add(textTituloLi);
		textTituloLi.setColumns(10);
		
		textCodigoLi = new JTextField();
		textCodigoLi.setEditable(false);
		textCodigoLi.setBounds(199, 267, 265, 30);
		frame.getContentPane().add(textCodigoLi);
		textCodigoLi.setColumns(10);
		
		textAutorLi = new JTextField();
		textAutorLi.setEditable(false);
		textAutorLi.setBounds(199, 333, 265, 32);
		frame.getContentPane().add(textAutorLi);
		textAutorLi.setColumns(10);
		
		textDispponibleLi = new JTextField();
		textDispponibleLi.setEditable(false);
		textDispponibleLi.setBounds(199, 409, 265, 30);
		frame.getContentPane().add(textDispponibleLi);
		textDispponibleLi.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(29, 41, 106, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(577, 41, 106, 61);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblTituloLi = new JLabel("Titulo");
		lblTituloLi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTituloLi.setBounds(40, 203, 95, 30);
		frame.getContentPane().add(lblTituloLi);
		
		JLabel lblCodigoLi = new JLabel("Codigo");
		lblCodigoLi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigoLi.setBounds(40, 267, 95, 30);
		frame.getContentPane().add(lblCodigoLi);
		
		JLabel lblAutorLi = new JLabel("Autor");
		lblAutorLi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAutorLi.setBounds(40, 333, 95, 30);
		frame.getContentPane().add(lblAutorLi);
		
		JLabel lblDisponibleLi = new JLabel("Disponible");
		lblDisponibleLi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDisponibleLi.setBounds(40, 409, 95, 30);
		frame.getContentPane().add(lblDisponibleLi);
		
		JLabel lblEstanteriaName = new JLabel("");
		lblEstanteriaName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEstanteriaName.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstanteriaName.setBounds(243, 41, 221, 61);
		frame.getContentPane().add(lblEstanteriaName);
	}

}
