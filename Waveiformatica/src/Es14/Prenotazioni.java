package Es14;


import java.util.Arrays;

public class Prenotazioni {
	
	private int numeroCliente;
	private int pianoPrenotato;
	
	
	

	public Prenotazioni(int numeroCliente, int pianoPrenotato) {
		this.numeroCliente = numeroCliente;
		this.pianoPrenotato = pianoPrenotato;
	}
	
	
			
		

	public int getNumeroCliente() {
		return numeroCliente;
	}





	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}





	public int getPianoPrenotato() {
		return pianoPrenotato;
	}





	public void setPianoPrenotato(int pianoPrenotato) {
		this.pianoPrenotato = pianoPrenotato;
	}





	@Override
	public String toString() {
		return "Prenotazioni [numeroCliente=" + numeroCliente + ", pianoPrenotato=" + pianoPrenotato + "]";
	}





	

	
	
	
	
	
}
