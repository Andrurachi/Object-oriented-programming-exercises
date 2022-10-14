package datos;

public class Decoraciones {

	private String a_mano;
	private String material;
	private boolean infantil;

	public String getA_mano() {
		return a_mano;
	}

	public void setA_mano(String a_mano) {
		this.a_mano = a_mano;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isInfantil() {
		return infantil;
	}

	public void setInfantil(boolean infantil) {
		this.infantil = infantil;
	}

	public Decoraciones(String a_mano, String material, boolean infantil) {
		super();
		this.a_mano = a_mano;
		this.material = material;
		this.infantil = infantil;
	}

	@Override
	public String toString() {
		return "Decoraciones [a_mano=" + a_mano + ", material=" + material + ", infantil=" + infantil + "]";
	}

}
