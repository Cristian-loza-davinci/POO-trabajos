package Logica;

public class Colectivo {
	
	private String patente;
	private Motor motor;
	private int tarifa;
	private int cant_pasajeros;
	private boolean chofer=true;
	
	
	public Colectivo(String patente, Motor motor, int tarifa, int cant_pasajeros, boolean chofer) {
		super();
		this.patente = patente;
		this.motor = motor;
		this.tarifa = tarifa;
		this.cant_pasajeros = cant_pasajeros;
		this.chofer = chofer;
	}


	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
	}


	public int getTarifa() {
		return tarifa;
	}


	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}


	public int getCant_pasajeros() {
		return cant_pasajeros;
	}


	public void setCant_pasajeros(int cant_pasajeros) {
		this.cant_pasajeros = cant_pasajeros;
	}


	public boolean isChofer() {
		return chofer;
	}


	public void setChofer(boolean chofer) {
		this.chofer = chofer;
	}


	@Override
	public String toString() {
		return "Colectivo [patente=" + patente + ", motor=" + motor + ", tarifa=" + tarifa + ", cant_pasajeros="
				+ cant_pasajeros + ", chofer=" + chofer + "]";
	}
	
	

}
