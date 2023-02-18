package Es19;

import java.util.Scanner;

public class MainBibilioteca {

	public static void main(String[] args) {
		
		Archivio archivio = new Archivio();
		Scanner scanner = new Scanner (System.in);
		System.out.println("inserisci 1 per aggiungere un utente e 2 per aggiungere un libro");
		int scelta = scanner.nextInt();
		switch (scelta) {
		case 1: archivio.newUsers(scanner.next(), scanner.next());
		System.out.println(archivio.toString());
		
		break;
		
		case 2: archivio.newBook(scanner.next());break;
		case 3: archivio.presta(archivio.trovaLibro(scanner.next()), archivio.trovaUtente(scanner.next(), scanner.next()));break;
		case 4: archivio.aggiorna();break;
		case 5: archivio.numeroLibri( archivio.trovaUtente(scanner.next(), scanner.next()));break;
		case 6: System.exit(0);break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + scelta);
		}

	}

}
