package Es01;

import java.util.Scanner;

public class ContoBancario {
	private double conto;
	private String password;
	Scanner scanner = new Scanner(System.in);

	public ContoBancario(double conto, String password) {
		this.conto = conto;
		this.password = password;
	}

	public double getConto() {
		return conto;
	}

	public void setConto(double conto) {
		this.conto = conto;
	}

	public void versamento() {
		System.out.println("quato vuoi versare?");
		try {
			double importo = scanner.nextDouble();
			setConto(getConto() + importo);
		} catch (Exception e) {
			System.out.println("non hai inserito un numero");
		}

	}

	public void prelevo() {
		System.out.println("quato vuoi prelevare??");
		double importo = scanner.nextDouble();
		if (controlloPrelievo(importo)) {
			setConto(getConto() - importo);
		} else {
			System.out.println("fondo insufficiente");
		}
	}

	public void stampaConto() {
		System.out.println("Il tuo conto in banca è di: " + getConto() + "€");
	}

	public boolean inserisciPassword() {
		int i = 0;
		System.out.println("inserisci la password");
		do {

			String passwordInserita = scanner.nextLine();
			if (controlloPassword(passwordInserita)) {
				System.out.println("Accesso consentito");
				i = 5;
			} else {
				System.out.println("Accesso negato");
				i++;
			}

		} while (i != 3 && i != 5);
		if (i == 5) {
			return true;
		} else if (i == 3) {
			return false;
		}
		return false;
	}

	public boolean controlloPassword(String passwordInserita) {
		if (passwordInserita.equalsIgnoreCase(password)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean controlloPrelievo(double importo) {
		if (importo <= conto) {
			return true;
		} else {
			return false;
		}
	}

}
