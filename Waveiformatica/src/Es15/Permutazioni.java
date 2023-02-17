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
		PermutationGenerator generator = new PermutationGenerator();
		generator.nextPermutation(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
		

		

	}

}
