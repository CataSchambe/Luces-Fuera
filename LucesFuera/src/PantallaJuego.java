package interfaceVisual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

public class PantallaJuego extends JFrame {

	private Light[][] luces;
	private JPanel gridPanel;
	private PantallaFinal pantallaFinal;

	public PantallaJuego() {
		final int fila = 3;
		final int columna = 3;

		luces = new Light[fila][columna];
		gridPanel = new JPanel(new GridLayout(fila, columna));

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				luces[i][j] = new Light();
				luces[i][j].setRandomState();

				final int row = i;
				final int col = j;

				JButton button = new JButton();
				button.setPreferredSize(new Dimension(70, 70));
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
						updateGrid();
						if (estaTodoapagado()) {
							setVisible(false);
							pantallaFinal = new PantallaFinal();
							pantallaFinal.setVisible(true);
						}
					}
				});

				gridPanel.add(button);
			}
		}

		getContentPane().add(gridPanel);

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
				JButton button = (JButton) gridPanel.getComponent(i * luces[0].length + j);
				button.setBackground(luces[i][j].isOn() ? Color.green : Color.red);
			}
		}
	}
}
