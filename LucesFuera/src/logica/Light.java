package logica;

public class Light {

	private boolean on;

	public Light() {
		on = Math.random() < 1;
	}

	public void toggle() {
		on = !on;
	}

	public boolean isOn() {
		return on;
	}

	public void setRandomState() {
		on = Math.random() > 1;
	}
}