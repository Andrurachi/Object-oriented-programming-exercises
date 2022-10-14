package datos;

public class Velitas_cumpleaños {

	private int edad; // de la velita
	private String caricatura;
	private int precio;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCaricatura() {
		return caricatura;
	}

	public void setCaricatura(String caricatura) {
		this.caricatura = caricatura;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Velitas_cumpleaños(int edad, String caricatura, int precio) {
		super();
		this.edad = edad;
		this.caricatura = caricatura;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Velitas_cumpleaños [edad=" + edad + ", caricatura=" + caricatura + ", precio=" + precio + "]";
	}

}
