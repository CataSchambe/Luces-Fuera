package logica;

import javax.swing.*;

import interfaceVisual.PantallaFinal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PantallaJuego extends JFrame {

	private Light[][] luces;
	private JPanel panelDeLuces;
	private PantallaFinal pantallaFinal;

	public PantallaJuego() {
		final int fila = 4;
		final int columna = 4;

		luces = new Light[fila][columna];
		panelDeLuces = new JPanel(new GridLayout(fila, columna));

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				luces[i][j] = new Light();
				luces[i][j].setRandomState();

				final int row = i;
				final int col = j;

				JButton button = new JButton();

				// aca va el random
				
			    if (new Random().nextBoolean()) { button.setBackground(Color.green);
				  
			  } else { button.setBackground(Color.red); }
				 
				button.setPreferredSize(new Dimension(100, 100));
				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						luces[row][col].toggle();
						for (int i = 0; i < luces.length; i++) {
							luces[i][col].toggle();
						}

						for (int j = 0; j < luces[0].length; j++) {
							luces[row][j].toggle();
						}
						
						if (estaTodoapagado()) {
							setVisible(false);
							pantallaFinal = new PantallaFinal();
							pantallaFinal.setVisible(true);
							
						}
						updateGrid();
					}
				});

				panelDeLuces.add(button);
			}
		}

		getContentPane().add(panelDeLuces);

		setTitle("Juego de Luces");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}

	private boolean estaTodoapagado() {
		boolean ret = true;
		for (int i = 0; i < luces.length; i++) {
			for (int j = 0; j < luces[0].length; j++) {
				ret = ret && !luces[i][j].isOn();
			}
		}
		return ret;
	}

	private void updateGrid() {
		for (int i = 0; i < luces.length; i++) {
			for (int j = 0; j < luces[0].length; j++) {
				
				
				JButton button = (JButton) panelDeLuces.getComponent(i * luces[0].length + j);
				boolean isOn = luces[i][j].isOn(); 
				button.setBackground(isOn? Color.green : Color.red);
			}
		}
	}
}
