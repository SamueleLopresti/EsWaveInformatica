package Es19;
/*
 * Abbonato: costruisce l’oggetto utente. 
 * Essa ha due variabili d’istanza e i seguenti metodi: 
 * String getCognome(), 
 * String getNome().
 */

public class Abbonato {
	private String nome;
	private String cognome;
	private int numeroLibriPresi;
	
	public Abbonato(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}


	public int getNumeroLibriPresi() {
		return numeroLibriPresi;
	}


	public void setNumeroLibriPresi(int numeroLibriPresi) {
		this.numeroLibriPresi = numeroLibriPresi;
	}


	@Override
	public String toString() {
		return "Abbonato [nome=" + nome + ", cognome=" + cognome + ", numeroLibriPresi=" + numeroLibriPresi + "]";
	}
	
	
	

}
