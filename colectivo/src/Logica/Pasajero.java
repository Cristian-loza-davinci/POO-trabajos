package Logica;

public class Pasajero {
	private String dni;
	private String nombre;
	private Sube sube;
	
	public Pasajero(String dni, String nombre, Sube sube) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sube = sube;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sube getSube() {
		return sube;
	}

	public void setSube(Sube sube) {
		this.sube = sube;
	}

	@Override
	public String toString() {
		return "Pasajero [dni=" + dni + ", nombre=" + nombre + ", sube=" + sube + "]";
	}
	
	
	

}
