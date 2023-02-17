package Es15;

import java.util.Arrays;

public class PermutationGenerator {

	public int[]nextPermutation(int []a){
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

		/*for (int i : a) {
			System.out.print(i + " ");
		}*/
		return a;
	}

	
	
	
	

	

}
