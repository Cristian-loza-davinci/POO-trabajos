package Logica;

public class Motor {
	
	private String num_parte;
	private String modelo;
	private boolean estado;
	
	
	public Motor(String num_parte, String modelo, boolean estado) {
		super();
		this.num_parte = num_parte;
		this.modelo = modelo;
		this.estado = estado;
	}


	public String getNum_parte() {
		return num_parte;
	}


	public void setNum_parte(String num_parte) {
		this.num_parte = num_parte;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Motor [num_parte=" + num_parte + ", modelo=" + modelo + ", estado=" + estado + "]";
	}
	
	

}
