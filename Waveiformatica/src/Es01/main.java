package Es01;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ContoBancario samuele = new ContoBancario(10_000, "giacomo");
		
		if (samuele.inserisciPassword()) {
			System.out.println("Ciao Samuele!");
	    	samuele.stampaConto();
	    	do {
	    		System.out.println("Quali operazione vuoi eseguire?");
	    		System.out.println("1) versamento");
	    		System.out.println("2) prelievo");
	    		System.out.println("3) fondo");
	    		System.out.println("4) Exit");
	    		int scelta = scanner.nextInt();
	    		System.out.println();
	    		switch (scelta) {
				case 1: samuele.versamento();
				break;
				case 2:samuele.prelevo();
				break;
				case 3: samuele.stampaConto();
				break;
				case 4: 
					System.out.println("Grazie arrivederci");
					System.exit(0);
				break;
				default:
					throw new IllegalArgumentException("operazione non esistente" );
				}
				
			} while (true);
		
		}
	}
}



