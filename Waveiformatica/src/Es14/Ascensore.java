package Es14;

import java.util.Arrays;

public class Ascensore {
	private int maxNumeroPiani;
	private int pianoCorrente;
	private int maxNumeroPersone;
	private int numeroPersoneCorrente;
	private Prenotazioni prenotazioni[];
	private int cont = 0;
	private int certezza = 0;
	int iterazione =0;

	public Ascensore(int maxNumeroPiani, int maxNumeroPersone) {
		this.maxNumeroPiani = maxNumeroPiani;
		this.pianoCorrente = 0;
		this.maxNumeroPersone = maxNumeroPersone;
		this.numeroPersoneCorrente = 0;
		this.prenotazioni = new Prenotazioni[10];
	}

	public int getNumeroPersoneCorrente() {
		return numeroPersoneCorrente;
	}

	public void entra(int numeroCliente, int pianoPrenotato) {
		iterazione++;
		try {
			if (numeroPersoneCorrente <= maxNumeroPersone) {
				this.numeroPersoneCorrente++;
				if (certezza == 0) {
					prenotazioni[cont] = new Prenotazioni(numeroCliente, pianoPrenotato);
					cont++;
				} else {
					for (int i = 0; i < prenotazioni.length - 1; i++) {
						if (prenotazioni[i].getNumeroCliente() == 0 && prenotazioni[i].getPianoPrenotato() == 0
								&& cont != 0) {
							prenotazioni[i] = new Prenotazioni(numeroCliente, pianoPrenotato);
							break;

						}
					}

				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("sbagliato entra");
		}

	}

	public void muovi() {
		certezza++;
		if (prenotazioni[0].getPianoPrenotato() <= maxNumeroPiani) {
			this.pianoCorrente = prenotazioni[0].getPianoPrenotato();
			for (int i = 0; i < iterazione; i++) {
				if (prenotazioni[i].getPianoPrenotato() == this.pianoCorrente) {
					this.numeroPersoneCorrente--;
				}
			}
			for (int i = 0; i < iterazione; i++) {
				if (prenotazioni[0].getPianoPrenotato() != prenotazioni[i].getPianoPrenotato()) {
					prenotazioni[0] = prenotazioni[i];
					prenotazioni[i] = new Prenotazioni(0, 0);
					break;
				}
			}
			for (int i = 0; i < iterazione - 1; i++) {
				if (prenotazioni[i].getNumeroCliente() == 0 && prenotazioni[i].getPianoPrenotato() == 0) {
					prenotazioni[i] = prenotazioni[i + 1];					
					prenotazioni[i+1] = new Prenotazioni(0, 0);

				}

			}

		}
	}
	public void letturaArray() {
		//prenotazioni[0] =new Prenotazioni(0, 0);
		for (Prenotazioni f : prenotazioni) {
			System.out.println(f);
		}
	}

	@Override
	public String toString() {
		return "Ascensore [maxNumeroPiani=" + maxNumeroPiani + ", pianoCorrente=" + pianoCorrente
				+ "\n, maxNumeroPersone=" + maxNumeroPersone + ", numeroPersoneCorrente=" + numeroPersoneCorrente
				+ "\n, prenotazioni=" + "\n" + Arrays.toString(prenotazioni) + ", cont=" + cont + "]";
	}

}
