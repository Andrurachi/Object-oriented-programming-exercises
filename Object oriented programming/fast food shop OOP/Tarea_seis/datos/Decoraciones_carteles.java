package datos;

public class Decoraciones_carteles {

	private String ocasion;
	private String color;
	private String nombre;

	public String getOcasion() {
		return ocasion;
	}

	public void setOcasion(String ocasion) {
		this.ocasion = ocasion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Decoraciones_carteles(String ocasion, String color, String nombre) {
		super();
		this.ocasion = ocasion;
		this.color = color;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Decoraciones_carteles [ocasion=" + ocasion + ", color=" + color + ", nombre=" + nombre + "]";
	}

}
