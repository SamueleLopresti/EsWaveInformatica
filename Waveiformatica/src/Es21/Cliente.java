package Es21;

public class Cliente {
	private String nominativo;
	private String nTelefono;
	private int n;
	public Cliente(String nominativo, String nTelefono) {
		this.nominativo = nominativo;
		this.nTelefono = nTelefono;
		this.n = 0;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public String getnTelefono() {
		return nTelefono;
	}
	public void setnTelefono(String nTelefono) {
		this.nTelefono = nTelefono;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "Cliente [nominativo=" + nominativo + ", nTelefono=" + nTelefono + ", n=" + n + "]";
	}
	
	
	

}
