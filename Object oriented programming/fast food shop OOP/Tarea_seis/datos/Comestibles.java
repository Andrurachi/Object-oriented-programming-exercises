package datos;

public class Comestible {
	private boolean caliente;
	private boolean azucar;
	private boolean gluten;

	public boolean isCaliente() {
		return caliente;
	}

	public void setCaliente(boolean caliente) {
		this.caliente = caliente;
	}

	public boolean isAzucar() {
		return azucar;
	}

	public void setAzucar(boolean azucar) {
		this.azucar = azucar;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	public Comestible(boolean caliente, boolean azucar, boolean gluten) {
		this.caliente = caliente;
		this.azucar = azucar;
		this.gluten = gluten;
	}

	@Override
	public String toString() {
		return "Comestible [caliente=" + caliente + ", azucar=" + azucar + ", gluten=" + gluten + "]";
	}

}
