package Es21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Spettacolo {
	private HashMap<Integer, Cliente> prenotazione = new HashMap<Integer, Cliente>();
	private Cliente[] prenotazioni;
	private int n_prenotazione;
	private ArrayList<Cliente> attesa;


	public Spettacolo(int n) {
		this.prenotazioni = new Cliente[n];
		this.attesa = new ArrayList<Cliente>();
		this.n_prenotazione = 3;

	}

	public int libero() {
		int postioccupati =0;
		for (HashMap.Entry<Integer, Cliente> entry  : prenotazione.entrySet()) {
			 postioccupati =+ entry.getValue().getN();
		}
		return n_prenotazione-postioccupati;
		
		/*for (int i = 0; i < prenotazioni.length; i++) {
			if (prenotazioni[i] == null || prenotazioni[i].getNominativo().equalsIgnoreCase(" ")
					&& prenotazioni[i].getnTelefono().equalsIgnoreCase(" ")) {
				return true;
			}
		}
		return false;*/
	}

	/*public int trova(String nome, String tel) {
		for (int i = 0; i < grandezza; i++) {
			if (prenotazioni[i].getNominativo().equalsIgnoreCase(nome)
					&& prenotazioni[i].getnTelefono().equalsIgnoreCase(tel)) {
				return 0;
			}
			for (int j = 0; j < attesa.size(); j++) {
				if (attesa.get(j).getNominativo().equalsIgnoreCase(nome)
						&& attesa.get(j).getnTelefono().equalsIgnoreCase(tel)) {
					return 1;
				}
			}
		}

		return -1;
	}*/

	public void prenota(Cliente nuovo) {
		
		if ((libero()-nuovo.getN())>=0) {
			
				prenotazione.put(nuovo.getId(), nuovo);
				
				
			
		
		}else {
			System.out.println("non ci sono posti liberi le tue prenotazioni sono in attesa");
			attesa.add(nuovo);
			
		}
		
		
		
		
		

		
		
		
		
		/*for (int h = 0; h < n; h++) {
			n_prenotazione++;
			if (libero()) {
				if (prenotazioni[0] != null) {
					for (int i = 0; i < cont; i++) {
						if (prenotazioni[i].getNominativo().equalsIgnoreCase(" ")
								&& prenotazioni[i].getnTelefono().equalsIgnoreCase(" ")) {
							prenotazioni[i] = new Cliente(nome, tel);
							prenotazioni[cont].setN(n);

						}

					}

					prenotazioni[cont] = new Cliente(nome, tel);
					cont++;
					grandezza++;
				} else {
					prenotazioni[cont] = new Cliente(nome, tel);
					grandezza++;
					cont++;

				}

			} else {
				attesa.add(new Cliente(nome, tel));

			}
		}
		for (int i = 0; i < cont; i++) {
			if (prenotazioni[i].getNominativo().equalsIgnoreCase(nome)
					&& prenotazioni[i].getnTelefono().equalsIgnoreCase(tel)) {
				prenotazioni[i].setN(n);
			}
		}
		if (attesa.size() >= 1) {
			if (attesa.get(0) != null) {
				for (int j = 0; j < attesa.size(); j++) {// .equalsIgnoreCase(nome)

					if (attesa.get(j).getNominativo().equalsIgnoreCase(nome)
							&& attesa.get(j).getnTelefono().equalsIgnoreCase(tel)) {
						attesa.get(j).setN(n);
					}
				}
			}
		}*/
	}

	public void disdici(Cliente cliente,int nu) {
		if (prenotazione.get(cliente.getId())== null) {
			for (int i = 0; i < attesa.size(); i++) {
				if (attesa.get(i).equals(cliente.getId())) {
					if (attesa.get(i).getN()<=0) {
					attesa.set(i, null);
					}else {
						attesa.get(i).setN(attesa.get(i).getN()-nu);
					}
					break;
				}System.out.println("utente non esistente");
				
			}	
		}else if (cliente.getN()<=0) {
			prenotazione.remove(cliente.getId());

			
		}else {
			cliente.setN(cliente.getN()-nu);
		}
		
		trasporta();
		
				
			
	
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for (int i = 0; i < prenotazioni.length; i++) {
			if (prenotazioni[i].getNominativo().equalsIgnoreCase(nome)
					&& prenotazioni[i].getnTelefono().equalsIgnoreCase(tel)) {
				if (attesa.size() >= 1) {

					for (int j = (n_prenotazione - prenotazioni[i].getN()); j < n + 1; j++) {

						if (attesa.get(0) != null) {
							prenotazioni[i] = new Cliente(attesa.get(0).getNominativo(), attesa.get(0).getnTelefono());
							prenotazioni[i].setN(n - 1);
							if (attesa.size() > 1) {
								for (int k = 0; k < attesa.size() - 1; k++) {

									attesa.set(0, attesa.get(k + 1));
									attesa.set(k + 1, null);

								}
							} else if (attesa.size() == 1) {
								attesa.set(0, null);
							}
						} else {
							for (int f = j; f < n_prenotazione; f++) {
								prenotazioni[i] = new Cliente(" ", " ");
								cont--;
							}
						}
					}
					break;

				} else {
					prenotazioni[i] = new Cliente(" ", " ");
					cont--;
				}

			}

		} n_prenotazione-=n;

		if (attesa.size() >= 1)

		{
			if (attesa.get(0) != null) {
				for (int j = 0; j < attesa.size(); j++) {
					if (attesa.get(j).getNominativo().equalsIgnoreCase(nome)
							&& attesa.get(j).getnTelefono().equalsIgnoreCase(tel)) {
						attesa.set(j, null);
						if (attesa.size() > 1) {
							for (int k = j; k < attesa.size() - 1; k++) {
								attesa.set(0, attesa.get(k + 1));
								attesa.set(k + 1, null);
							}

						}
						break;
					}
				}
			}
		}*/
	}
	
	public void trasporta() {
		for (int i = 0; i < attesa.size(); i++) {
			if (attesa.get(i).getN()<=libero()) {
				prenotazione.put(attesa.get(i).getId(), attesa.get(i));
				attesa.set(i, null);
			}
			
		}
	}

	public boolean incompleto(String nome, String tel) {

		for (int i = 0; i < prenotazioni.length; i++) {
			if (prenotazioni[i].getNominativo().equalsIgnoreCase(nome)
					&& prenotazioni[i].getnTelefono().equalsIgnoreCase(tel)) {
				for (int j = 0; j < attesa.size(); j++) {
					if (attesa.get(j) == null) {
						return false;
					} else if (attesa.get(j).getNominativo().equalsIgnoreCase(nome)
							&& attesa.get(j).getnTelefono().equalsIgnoreCase(tel)) {
						return true;

					}
				}
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "Spettacolo [prenotazione=" + prenotazione + ", n_prenotazione=" + n_prenotazione + ", attesa=" + attesa
				+ "]";
	}

	

	
	

}
