package datos;

public class Comestible_pasteles {

	private String tamaño;
	private boolean crema;
	private boolean licor;
	private Horarios_preparacion horarios_preparacion;

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public boolean isCrema() {
		return crema;
	}

	public void setCrema(boolean crema) {
		this.crema = crema;
	}

	public boolean isLicor() {
		return licor;
	}

	public void setLicor(boolean licor) {
		this.licor = licor;
	}

	public Comestible_pasteles(String tamaño, boolean crema, boolean licor, Horarios_preparacion horarios_preparacion) {
		super();
		this.tamaño = tamaño;
		this.crema = crema;
		this.licor = licor;
		this.horarios_preparacion = horarios_preparacion;
	}

	@Override
	public String toString() {
		return "Comestible_pasteles [tamaño=" + tamaño + ", crema=" + crema + ", licor=" + licor
				+ ", horarios_preparacion=" + horarios_preparacion + "]";
	}

}
