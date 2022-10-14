package datos;

public class Cupcake_chocolate {

	private int precio;
	private boolean chips_chocolate;
	private boolean empacado;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean getChips_chocolate() {
		return chips_chocolate;
	}

	public void setChips_chocolate(boolean chips_chocolate) {
		this.chips_chocolate = chips_chocolate;
	}

	public boolean getEmpacado() {
		return empacado;
	}

	public void setEmpacado(boolean empacado) {
		this.empacado = empacado;
	}

	public Cupcake_chocolate(int precio, boolean chips_chocolate, boolean empacado) {
		super();
		this.precio = precio;
		this.chips_chocolate = chips_chocolate;
		this.empacado = empacado;
	}

	@Override
	public String toString() {
		return "Cupcake_chocolate [precio=" + precio + ", chips_chocolate=" + chips_chocolate + ", empacado=" + empacado
				+ "]";
	}

}
