package interfaceVisual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
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
		botonDeInicio.setBounds(179, 187, 78, 42);
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

		JLabel lblNewLabel_1 = new JLabel("INGRESE SU NOMBRE:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(27, 112, 195, 24);
		getContentPane().add(lblNewLabel_1);
	}
}
