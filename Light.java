package interfaceVisual;

class Light {

	private boolean on;

	public Light() {
		on = Math.random() < 2;
	}

	public void toggle() {

		on = !on;
	}

	public boolean isOn() {
		return on;
	}

	public void setRandomState() {
		on = Math.random() > 0;
	}

}