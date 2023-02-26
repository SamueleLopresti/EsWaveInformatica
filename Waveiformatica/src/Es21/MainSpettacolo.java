package Es21;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainSpettacolo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Spettacolo spettacolo = new Spettacolo(2);
		Cliente a = new Cliente("giorgio", "33", 3, 001);
		Cliente b = new Cliente("mario", "22", 2,002);
		
		spettacolo.prenota(a);
		System.out.println(spettacolo.toString());
		spettacolo.prenota(b);
		System.out.println(spettacolo.toString());
		spettacolo.disdici(a, 2);
		System.out.println(spettacolo.toString());

		
		
		/*do {
			String[] opzioni = { "prenota", "disdici", "trova", "libero", "situazione attuale", "incompleto", "exit" };

			int scelta = JOptionPane.showOptionDialog(null, "scegli un'opzione", "Prenotazione Spettacolo",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opzioni, opzioni[0]);

			switch (scelta) {

			case 0:
				spettacolo.prenota(JOptionPane.showInputDialog(null, "Inserisci il nome").toLowerCase(),
						JOptionPane.showInputDialog(null, "Inserisci numero di telefono").toLowerCase(),
						Integer.parseInt(
								JOptionPane.showInputDialog(null, "inserisci quanti biglietti vuoi acquistare")));
				JOptionPane.showMessageDialog(null, "aggiuta prenotazione");
				break;

			case 1:
				spettacolo.disdici(JOptionPane.showInputDialog(null, "Inserisci il nome").toLowerCase(),
						JOptionPane.showInputDialog(null, "Inserisci numero di telefono").toLowerCase(),
						Integer.parseInt(JOptionPane.showInputDialog(null, "inserisci quanti biglietti vuoi disdire")));
				JOptionPane.showMessageDialog(null, "prenotazione disdetta");
				break;

			case 2:
				JOptionPane.showMessageDialog(null,
						spettacolo.trova(JOptionPane.showInputDialog(null, "Inserisci il nome").toLowerCase(),
								JOptionPane.showInputDialog(null, "Inserisci numero di telefono").toLowerCase()));
				break;

			case 3:
				JOptionPane.showMessageDialog(null, spettacolo.libero());
				break;

			case 4:
				JOptionPane.showMessageDialog(null, spettacolo.toString());
				break;

			case 5:
				JOptionPane.showMessageDialog(null,
						spettacolo.incompleto(JOptionPane.showInputDialog(null, "Inserisci il nome").toLowerCase(),
								JOptionPane.showInputDialog(null, "Inserisci numero di telefono").toLowerCase()));
				break;

			case 6:
				System.exit(0);
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + scelta);
			}

		} while (true);*/
	}

}
