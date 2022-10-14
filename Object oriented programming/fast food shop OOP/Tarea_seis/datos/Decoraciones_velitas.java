package datos;

public class Decoraciones_velitas {

	private String ocasion; // de la velita
	private boolean comestible;
	private String color;

	public String getOcasion() {
		return ocasion;
	}

	public void setOcasion(String ocasion) {
		this.ocasion = ocasion;
	}

	public boolean isComestible() {
		return comestible;
	}

	public void setComestible(boolean comestible) {
		this.comestible = comestible;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Decoraciones_velitas(String string, boolean comestible, String string2) {
		super();
		this.ocasion = string;
		this.comestible = comestible;
		this.color = string2;
	}

	@Override
	public String toString() {
		return "Decoraciones_velitas [ocasion=" + ocasion + ", comestible=" + comestible + ", color=" + color + "]";
	}

}
