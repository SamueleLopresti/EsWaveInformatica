package Es21;


import java.util.ArrayList;
import java.util.Arrays;

public class Spettacolo {
	private Cliente[] prenotazioni;
	private int n_prenotazione;
	private ArrayList<Cliente> attesa;
	private int cont;
	private int grandezza;
	

	public Spettacolo(int n) {
		this.prenotazioni = new Cliente[n];
		this.attesa = new ArrayList<Cliente>();
		cont = 0;
		grandezza =0;
		
	}

	public boolean libero() {
		for (int i = 0; i < prenotazioni.length; i++) {
			if (prenotazioni[i] == null || prenotazioni[i].getNominativo().equalsIgnoreCase(" ")
					&& prenotazioni[i].getnTelefono().equalsIgnoreCase(" ") ) {
				return true;
			}
		}
		return false;
	}

	public int trova(String nome, String tel) {
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
	}

	public void prenota(String nome, String tel, int n) {
		

		for (int h = 0; h < n; h++) {
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
				// prenotazioni[cont] = new Cliente(nome, tel);
				// cont++;

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
		}
	}

	public void disdici(String nome, String tel, int n) {
		for (int i = 0; i < prenotazioni.length; i++) {
			if (prenotazioni[i].getNominativo().equalsIgnoreCase(nome)
					&& prenotazioni[i].getnTelefono().equalsIgnoreCase(tel)) {
				if (attesa.size() >= 1) {
					
					for (int j = (n_prenotazione - prenotazioni[i].getN()); j < n + 1; j++) {
					
						if (attesa.get(0) != null) {
							prenotazioni[i] = new Cliente(attesa.get(0).getNominativo(), attesa.get(0).getnTelefono());
							if (attesa.size() > 1) {
								for (int k = 0; k < attesa.size() - 1; k++) {
									attesa.set(0, attesa.get(k + 1));
									attesa.set(k + 1, null);
								}
							}
						} else {
							for (int f = j; f < n_prenotazione; f++) {
								prenotazioni[i] = new Cliente(" ", " ");
								cont--;
							}
						}
					}

					cont--;

					
					break;
				} else {
					prenotazioni[i] = new Cliente(" ", " ");
					cont--;
				}
				break;
			}

		}

		
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
		return "Spettacolo [prenotazioni=" + Arrays.toString(prenotazioni) + ", n_prenotazione=" + n_prenotazione
				+ ", attesa=" + attesa +  "]";
	}

}
