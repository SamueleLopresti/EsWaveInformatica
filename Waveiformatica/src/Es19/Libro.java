package Es19;
/*
 *  Libro: costruisce l’oggetto libro. 
 *  Ha tre variabili d’istanza: 
 *  titolo, utente a cui è prestato, data scadenza del prestito. 
 *  Ha inoltre i relativi metodi accessori.
 */

public class Libro {
	private String titolo;
	private Abbonato utentePrestato;
	private Data scadenza;
	
	public Libro(String titolo) {
		this.titolo = titolo;
	}
		
	public String getTitolo() {
		return titolo;
	}
	public Abbonato getUtentePrestato() {
		return utentePrestato;
	}
	public Data getScadenza() {
		return scadenza;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public void setUtentePrestato(Abbonato utentePrestato) {
		this.utentePrestato = utentePrestato;
	}


	public void setScadenza(Data scadenza) {
		this.scadenza = scadenza;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", utentePrestato=" + utentePrestato + ", scadenza=" + scadenza + "]";
	}
	
	
	

}
