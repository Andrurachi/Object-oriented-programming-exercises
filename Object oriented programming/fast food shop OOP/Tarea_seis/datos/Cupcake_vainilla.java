package datos;

public class Cupcake_vainilla {

	private int precio;
	private boolean empacado;
	private boolean helado;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean getEmpacado() {
		return empacado;
	}

	public void setEmpacado(boolean empacado) {
		this.empacado = empacado;
	}

	public boolean isHelado() {
		return helado;
	}

	public void setHelado(boolean helado) {
		this.helado = helado;
	}

	public Cupcake_vainilla(int precio, boolean empacado, boolean helado) {
		super();
		this.precio = precio;
		this.empacado = empacado;
		this.helado = helado;
	}

	@Override
	public String toString() {
		return "Cupcake_vainilla [precio=" + precio + ", empacado=" + empacado + ", helado=" + helado + "]";
	}

}
