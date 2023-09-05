package interfaceVisual;

import javax.swing.JFrame;
import javax.swing.JLabel;

import interfaceVisual.PantallaInicio;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PantallaFinal extends JFrame {

	public PantallaFinal() {
		getContentPane().setBackground(new Color(95, 158, 160));
		setTitle("\"Programacion III - Bienvenidos\"");
		setSize(375, 322);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel lblMensaje = new JLabel("¡GANASTE!");
		lblMensaje.setForeground(new Color(255, 255, 240));
		lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblMensaje.setBounds(81, 11, 200, 79);
		getContentPane().add(lblMensaje);

		JButton btnReiniciar = new JButton("JUGAR DE NUEVO");
		btnReiniciar.setForeground(new Color(248, 248, 255));
		btnReiniciar.setBackground(new Color(0, 0, 255));
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaInicio home = new PantallaInicio();
				home.setResizable(false);
				home.setVisible(true);
				home.setLocationRelativeTo(null);
				dispose();
			}
		});
		btnReiniciar.setBounds(26, 152, 159, 57);
		getContentPane().add(btnReiniciar);

		JButton btnClose = new JButton("SALIR");
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(272, 571, 129, 35);
		getContentPane().add(btnClose);

		JButton btnCerrar = new JButton("");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCerrar.setIcon(new ImageIcon(PantallaFinal.class.getResource("/imagenes/CirculoRojo.png")));
		btnCerrar.setBackground(new Color(255, 0, 0));
		btnCerrar.setForeground(new Color(0, 0, 0));
		btnCerrar.setBounds(236, 152, 75, 57);
		getContentPane().add(btnCerrar);

	}
}
