package Logica;

public class Sube {
	private String num_sube;
	private int credito;
	
	public Sube(String num_sube, int credito) {
		super();
		this.num_sube = num_sube;
		this.credito = credito;
	}

	public String getNum_sube() {
		return num_sube;
	}

	public void setNum_sube(String num_sube) {
		this.num_sube = num_sube;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Sube [num_sube=" + num_sube + ", credito=" + credito + "]";
	}
	
	

}
