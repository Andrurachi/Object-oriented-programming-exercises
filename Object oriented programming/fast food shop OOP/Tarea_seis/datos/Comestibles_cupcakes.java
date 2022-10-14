package datos;

public class Comestible_cupcakes {
	private boolean chispitas;
	private boolean chantilly;
	private String tamaño;
	private Horarios_preparacion horarios_preparacion;

	public boolean isChispitas() {
		return chispitas;
	}

	public void setChispitas(boolean chispitas) {
		this.chispitas = chispitas;
	}

	public boolean isChantilly() {
		return chantilly;
	}

	public void setChantilly(boolean chantilly) {
		this.chantilly = chantilly;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public Comestible_cupcakes(boolean chispitas, boolean chantilly, String tamaño,
			Horarios_preparacion horarios_preparacion) {
		super();
		this.chispitas = chispitas;
		this.chantilly = chantilly;
		this.tamaño = tamaño;
		this.horarios_preparacion = horarios_preparacion;
	}

	@Override
	public String toString() {
		return "Comestible_cupcakes [chispitas=" + chispitas + ", chantilly=" + chantilly + ", tamaño=" + tamaño
				+ ", horarios_preparacion=" + horarios_preparacion + "]";
	}

}
