package Es19;
/*
 * Archivio: 
 * essa implementa due arrayList, 
 * una contenente gli abbonati alla biblioteca e l’altra i libri presenti, 
 * oltre ad un riferimento alla data, e i seguenti metodi: 
 * void nuovoLibro(String unTitolo), 
 * void nuovoUtente(String unNome, String unCognome), 
 * int trovaUtente(String unNome, String unCognome), 
 * Data scadenza(Data date), 
 * int presta(Libro unLibro, Abbonato unUtente), 
 * void aggiorna() [si riferisce all’aggiornamento dell’ora], 
 * int numLibri(Abbonato anAbb) 
 * [restituisce il numero di libri posseduti da un dato utente] 
 */

import java.util.ArrayList;

public class Archivio {
	private ArrayList<Abbonato> abb = new ArrayList<>();
	private ArrayList<Libro> lib = new ArrayList<>();
	private Data corrente = new Data(18, 2, 2023);
	
	public void newUsers (String newName,String newSurname) {
		abb.add(new Abbonato(newName, newSurname));
	}
	
	public void newBook (String newTitle) {
		lib.add(new Libro(newTitle) );
	}
	
	public Abbonato trovaUtente (String searchName,String searchSurname) {
		int i;
		for ( i = 0; i < abb.size(); i++) {
			if (abb.get(i).getNome().equalsIgnoreCase(searchName) && abb.get(i).getCognome().equalsIgnoreCase(searchSurname) ) {
				break;}
		}
		return abb.get(i);

	}
	public Data scadenza (Data date) {
		date.setDay(corrente.getDay());
		date.setMonth(corrente.getDay()+1);
		date.setYear(corrente.getDay());
		
		return date;
		 
		
	}
	
	public int presta (Libro unLibro,Abbonato unAbbonato) {
		unLibro.setUtentePrestato(unAbbonato);
		unAbbonato.setNumeroLibriPresi(unAbbonato.getNumeroLibriPresi()+1);
		unLibro.setScadenza(scadenza(new Data()));
		return 1;
	}
	
	
	public void aggiorna () {
		/*corrente.setDay(a);
		corrente.setMonth(b);
		corrente.setYear(c);*/
		corrente.nextDay();
		
	}
	
	
	
	
	
	public int numeroLibri (Abbonato anAbb) {
		
		return trovaUtente(anAbb.getNome(), anAbb.getCognome()).getNumeroLibriPresi();
		
	}
	public Libro trovaLibro (String tt) {
		int i ;
		for ( i = 0; i < lib.size(); i++) {
			if (lib.get(i).getTitolo().equalsIgnoreCase(tt)) {
			break;	
			}
		}	return lib.get(i);
	}

	public ArrayList<Abbonato> getAbb() {
		return abb;
	}

	public ArrayList<Libro> getLib() {
		return lib;
	}

	public Data getCorrente() {
		return corrente;
	}

	@Override
	public String toString() {
		return "Archivio [abb=" + abb + ", lib=" + lib + ", corrente=" + corrente + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
