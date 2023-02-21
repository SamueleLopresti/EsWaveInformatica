package Es21;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainSpettacolo {
	public static void main(String[] args) {
		/*Spettacolo spettacolo = new Spettacolo(3);
		System.out.println(spettacolo.libero());
		spettacolo.prenota("giorgio", "011111");
		spettacolo.prenota("alessandro", "011112");
		spettacolo.prenota("sara", "011113");
		System.out.println(spettacolo.toString());
		spettacolo.prenota("giulia", "011114");
		System.out.println(spettacolo.toString());
		spettacolo.disdici("giulia", "011114");
		System.out.println(spettacolo.toString());
		System.out.println(spettacolo.libero());
		System.out.println(spettacolo.trova("giorgio", "011111"));
		spettacolo.prenota("giorgio", "011111");
		spettacolo.prenota("giorgio", "011111");
		System.out.println(spettacolo.incompleto("giorgio", "011111"));*/
		Scanner scanner= new Scanner(System.in);
		Spettacolo spettacolo = new Spettacolo(2);
		
		do {
			String [] opzioni = {"prenota","disdici","trova","libero","situazione attuale","incompleto","exit"};
			/*System.out.println("1) prenota");
			System.out.println("2) disdici");
			System.out.println("3) trova ");
			System.out.println("4) libero");
			System.out.println("5) sitazione attuale");
			System.out.println("6) incompleto");
			System.out.println("7) exit");*/
		//int scelta = scanner.nextInt();
			int scelta = JOptionPane.showOptionDialog(null, "scegli un'opzione", "Prenotazione Spettacolo", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, opzioni, opzioni[0]);
			
		switch (scelta) {
		
		case 0: spettacolo.prenota(JOptionPane.showInputDialog(null, "Inserisci il nome").toLowerCase(),JOptionPane.showInputDialog(null,
				"Inserisci numero di telefono").toLowerCase(),Integer.parseInt(JOptionPane.showInputDialog(null, "inserisci quanti biglietti vuoi acquistare"))  );
		JOptionPane.showMessageDialog(null, "aggiuta prenotazione");
		break;
		
		case 1: spettacolo.disdici(JOptionPane.showInputDialog(null, "Inserisci il nome").toLowerCase(),JOptionPane.showInputDialog(null,
				"Inserisci numero di telefono").toLowerCase(),Integer.parseInt(JOptionPane.showInputDialog(null, "inserisci quanti biglietti vuoi disdire")));
		JOptionPane.showMessageDialog(null, "prenotazione disdetta");
		break;
		
		case 2: 
		JOptionPane.showMessageDialog(null, spettacolo.trova(JOptionPane.showInputDialog(null, "Inserisci il nome").toLowerCase(),JOptionPane.showInputDialog(null,
				"Inserisci numero di telefono").toLowerCase()));break;
		
		case 3: 
		JOptionPane.showMessageDialog(null, spettacolo.libero());break;
		
		case 4: 
		JOptionPane.showMessageDialog(null, spettacolo.toString());
		break;
		
		case 5: 
				JOptionPane.showMessageDialog(null, spettacolo.incompleto(JOptionPane.showInputDialog(null, "Inserisci il nome").toLowerCase(),JOptionPane.showInputDialog(null,
						"Inserisci numero di telefono").toLowerCase()));break;
		
		case 6: System.exit(0);break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + scelta);
		}
			
		} while (true);
	}


		
		
	}


