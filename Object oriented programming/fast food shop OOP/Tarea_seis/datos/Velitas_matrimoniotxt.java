package datos;

public class Velitas_matrimonio {

	private String pareja; // hombre mujer. etc
	private String tamaño;
	private int precio;

	public String getPareja() {
		return pareja;
	}

	public void setPareja(String pareja) {
		this.pareja = pareja;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Velitas_matrimonio(String pareja, String tamaño, int precio) {
		super();
		this.pareja = pareja;
		this.tamaño = tamaño;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Velitas_matrimonio [pareja=" + pareja + ", tamaño=" + tamaño + ", precio=" + precio + "]";
	}

}
