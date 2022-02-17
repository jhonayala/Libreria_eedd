package vistas;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnLogin;


	/**
	 * Create the application.
	 */
	public VentLogin() {
		initialize();
		frame.revalidate();
		frame.repaint();
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
		
		textField = new JTextField();
		textField.setBounds(135, 83, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 152, 96, 19);
		frame.getContentPane().add(passwordField);
		
		JLabel lblInicioSeccion = new JLabel("Inicio de Seccion");
		lblInicioSeccion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblInicioSeccion.setToolTipText("");
		lblInicioSeccion.setBounds(120, 29, 128, 19);
		frame.getContentPane().add(lblInicioSeccion);
		
		JLabel lblInUsuario = new JLabel("Usuario");
		lblInUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblInUsuario.setBounds(135, 58, 96, 13);
		frame.getContentPane().add(lblInUsuario);
		
		JLabel lblInContraseña = new JLabel("Contrase\u00F1a");
		lblInContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		lblInContraseña.setBounds(140, 129, 91, 13);
		frame.getContentPane().add(lblInContraseña);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ContSam = new String(passwordField.getPassword());
				if((textField.getText().equals("samuel") )&&(ContSam.equals("1234"))) {
					frame.dispose();
					new Libreria();
				}else {
					JOptionPane.showMessageDialog(btnLogin, "El nombre de usuario o la contraseña no coinciden");
				}
			}
		});
		btnLogin.setBounds(146, 202, 85, 21);
		frame.getContentPane().add(btnLogin);
		frame.getRootPane().setDefaultButton(btnLogin);
	}
}
