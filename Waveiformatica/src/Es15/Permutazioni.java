package Es15;
/*
 * Es. 15 

Scrivete un programma che produca 10 permutazioni casuali dei numeri da 1 a 10. 
Per generare una permutazione casuale dovete riempire un array con i numeri da 1 a 10 
in modo che non ve ne siano 2 uguali. Potreste farlo in modo brutale, 
chiamando Random.nextInt finché produce un valore non ancora presente nell’array,
ma dovreste, invece, usare un metodo più intelligente: 
create un secondo array e inseritevi i numeri da 1 a 10; 
poi, prendetene uno a caso, rimovetelo e accordatelo all’array che contiene la permutazione.
Ripetete 10 volte. Realizzate una classe PermutationGenerator che abbia il metodo int[] nextPermutation. 
 */

public class Permutazioni {

	public static void main(String[] args) {

		int[] a = new int[10];

		int[] b = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int ciclo = a.length;
		System.out.println(ciclo);
		System.out.println("stampa random ");
		for (int i = 0; i < a.length; i++) {

				int numeroR = (int) (Math.random() * ciclo);
				System.out.print(numeroR + "    " + b[numeroR]);
				System.out.println();
				int temp = 0;
				a[i] = b[numeroR];
				temp = b[numeroR];
				b[numeroR] = b[ciclo - 1];
				b[ciclo - 1] = temp;
				ciclo--;
				
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
