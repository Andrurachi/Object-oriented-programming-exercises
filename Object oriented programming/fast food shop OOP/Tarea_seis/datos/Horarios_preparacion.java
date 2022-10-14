package datos;

public class Horarios_preparacion {

	private String jornada;
	private boolean dia_habil;

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public boolean isDia_habil() {
		return dia_habil;
	}

	public void setDia_habil(boolean dia_habil) {
		this.dia_habil = dia_habil;
	}

	public Horarios_preparacion(String jornada, boolean dia_habil) {
		this.jornada = jornada;
		this.dia_habil = dia_habil;
	}

	@Override
	public String toString() {
		return "Horarios_preparacion [jornada=" + jornada + ", dia_habil=" + dia_habil + "]";
	}

}
