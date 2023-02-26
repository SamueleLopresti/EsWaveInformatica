package Es21;

public class Cliente {
	private String nominativo;
	private String nTelefono;
	private int n;
	private int id;
	public Cliente(String nominativo, String nTelefono,int n,int id) {
		this.nominativo = nominativo;
		this.nTelefono = nTelefono;
		this.n = n;
		this.id = id;
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
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cliente [nominativo=" + nominativo + ", nTelefono=" + nTelefono + ", n=" + n + ", id=" + id + "]";
	}
	
	
	
	

}
