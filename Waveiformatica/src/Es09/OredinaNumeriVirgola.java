package Es09;

import java.util.Scanner;

public class OredinaNumeriVirgola {

	public static void main(String[] args) {
		System.out.println("inserisci 3 numeri");
		Scanner scanner = new Scanner(System.in);
		try {
			double n1 = scanner.nextDouble();
			double n2 = scanner.nextDouble();
			double n3 = scanner.nextDouble();
			double[] array = { n1, n2, n3 };
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					double temp = 0;
					if (array[i] < array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}

				}
			}
			for (double d : array) {
				System.out.println(d + " ");
			}
		} catch (Exception inputMisException) {
			System.out.println("unserisci un numero idiota");

		}

	}

}
