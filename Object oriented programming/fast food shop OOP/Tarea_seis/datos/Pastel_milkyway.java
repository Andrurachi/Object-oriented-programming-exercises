package datos;

public class Pastel_milkyway {

	private int precio;
	private boolean bajo_azucar;
	private String forma;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isBajo_azucar() {
		return bajo_azucar;
	}

	public void setBajo_azucar(boolean bajo_azucar) {
		this.bajo_azucar = bajo_azucar;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public Pastel_milkyway(int precio, boolean bajo_azucar, String forma) {
		super();
		this.precio = precio;
		this.bajo_azucar = bajo_azucar;
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Pastel_milkyway [precio=" + precio + ", bajo_azucar=" + bajo_azucar + ", forma=" + forma + "]";
	}

}
