package logica;

import javax.swing.SwingUtilities;

import interfaceVisual.PantallaInicio;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				PantallaInicio pantallaInicio = new PantallaInicio();
				pantallaInicio.setVisible(true);
			}
		});
	}
}
