package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import models.Estanteria;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VisEstanteria {

	private JFrame frame;
	private Estanteria estanteria;
	private JTextField textTituloLi;
	private JTextField textCodigoLi;
	private JTextField textAutorLi;
	private JTextField textDisponibleLi;
	private int index;
	private JButton btnAtras;
	private JLabel lblEstanteriaName;
	private JButton btnSiguiente;
	private JLabel lblTituloLi;
	private JLabel lblDisponibleLi;
	private JLabel lblCodigoLi;
	private JLabel lblAutorLi;
	private JButton btnIrMenu;
	private JButton btnReservar;

	/**
	 * Create the application.
	 */
	public VisEstanteria(String n) {
		initialize();
		estanteria = new Estanteria(n);
		index = 0;
		imprimirLibro();

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

		textDisponibleLi = new JTextField();
		textDisponibleLi.setEditable(false);
		textDisponibleLi.setBounds(199, 409, 265, 30);
		frame.getContentPane().add(textDisponibleLi);
		textDisponibleLi.setColumns(10);

		btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimirAtras();

			}
		});
		btnAtras.setBounds(29, 41, 106, 61);
		frame.getContentPane().add(btnAtras);

		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimirSiguiente();
			}
		});
		btnSiguiente.setBounds(577, 41, 106, 61);
		frame.getContentPane().add(btnSiguiente);
		lblTituloLi = new JLabel("Titulo");
		lblTituloLi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTituloLi.setBounds(40, 203, 95, 30);
		frame.getContentPane().add(lblTituloLi);

		lblCodigoLi = new JLabel("Codigo");
		lblCodigoLi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCodigoLi.setBounds(40, 267, 95, 30);
		frame.getContentPane().add(lblCodigoLi);

		lblAutorLi = new JLabel("Autor");
		lblAutorLi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAutorLi.setBounds(40, 333, 95, 30);
		frame.getContentPane().add(lblAutorLi);

		lblDisponibleLi = new JLabel("Disponible");
		lblDisponibleLi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDisponibleLi.setBounds(40, 409, 95, 30);
		frame.getContentPane().add(lblDisponibleLi);

		lblEstanteriaName = new JLabel("");
		lblEstanteriaName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblEstanteriaName.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstanteriaName.setBounds(243, 41, 221, 61);
		frame.getContentPane().add(lblEstanteriaName);

		btnIrMenu = new JButton("Menu");
		btnIrMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new Libreria();
			}
		});
		btnIrMenu.setBounds(50, 526, 85, 40);
		frame.getContentPane().add(btnIrMenu);

		btnReservar = new JButton("Reservar");
		btnReservar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reservarlibro();
			}
		});
		btnReservar.setBounds(464, 533, 106, 33);
		frame.getContentPane().add(btnReservar);
	}

	public void imprimirLibro() {
		textTituloLi.setText(this.estanteria.getEstanteria().get(index).getTitulo());
		textCodigoLi.setText(String.valueOf(this.estanteria.getEstanteria().get(index).getCodigo()));
		textAutorLi.setText(this.estanteria.getEstanteria().get(index).getAutor());
		if (this.estanteria.getEstanteria().get(index).isDisponible())
			textDisponibleLi.setText("si");
		else
			textDisponibleLi.setText("no");

	}

	public void imprimirSiguiente() {
		index++;
		if (index == this.estanteria.getEstanteria().size())
			index = 0;
		imprimirLibro();

	}

	public void imprimirAtras() {
		index--;
		if(index<0)
			index=this.estanteria.getEstanteria().size()-1;
		imprimirLibro();

	}
	public void reservarlibro() {
		if(this.estanteria.getEstanteria().get(index).isDisponible()) {
			this.estanteria.getEstanteria().get(index).setDisponible(false);
		}else
			this.estanteria.getEstanteria().get(index).setDisponible(true);
		imprimirLibro();

			
	}
}
