package interfaceVisual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import logica.PantallaJuego;

import java.awt.Font;
import java.awt.Color;

public class PantallaInicio extends JFrame {

	private JButton botonDeInicio;
	private JTextField textField;

	public PantallaInicio() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().setBackground(Color.PINK);
		setTitle("\"Programacion III - Bienvenidos\"");
		setSize(480, 320);
		setLocationRelativeTo(null);

		botonDeInicio = new JButton("Iniciar");
		botonDeInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		botonDeInicio.setBounds(250, 186, 78, 42);
		botonDeInicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				PantallaJuego juego = new PantallaJuego();
				juego.setVisible(true);
				dispose();
			}
		});
		getContentPane().setLayout(null);

		getContentPane().add(botonDeInicio);

		JLabel lblNewLabel = new JLabel("TRABAJO PRACTICO N°1: LIGHTS OUT");
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 20));
		lblNewLabel.setBounds(66, 11, 339, 42);
		getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(219, 114, 186, 27);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel nombre = new JLabel("INGRESE SU NOMBRE:");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nombre.setBounds(27, 112, 195, 24);
		getContentPane().add(nombre);
		/*private boolean validateName(String text) {
			if (text.length() < 3 || text == null || text.trim().isEmpty()) {
				return false;
			}
			return true;
		}
		*/
		
		JButton reglas = new JButton("Reglas");
		reglas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"                     Para ganar el juego todas las luces tienen que estar en Rojo " + " \n " +
											"Tene en cuenta que cuando presiones algún botón todas las luces de la fila y de la columna " +
						" \n " + " en la que hiciste click van a cambiar su estado al contrario en el que estaban " + " \n " + 
											"                                                                  Buena suerte ");
			}
			
		});
		reglas.setBounds(72, 188, 78, 42);
		getContentPane().add(reglas);
	}
}
