package datos;

public class Pastel_vino {

	private int precio;
	private boolean pastillaje;
	private boolean uvas_pasas;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isPastillaje() {
		return pastillaje;
	}

	public void setPastillaje(boolean pastillaje) {
		this.pastillaje = pastillaje;
	}

	public boolean isUvas_pasas() {
		return uvas_pasas;
	}

	public void setUvas_pasas(boolean uvas_pasas) {
		this.uvas_pasas = uvas_pasas;
	}

	public Pastel_vino(int precio, boolean pastillaje, boolean uvas_pasas) {
		super();
		this.precio = precio;
		this.pastillaje = pastillaje;
		this.uvas_pasas = uvas_pasas;
	}

	@Override
	public String toString() {
		return "Pastel_vino [precio=" + precio + ", pastillaje=" + pastillaje + ", uvas_pasas=" + uvas_pasas + "]";
	}

}
