package Es08;

import java.util.Scanner;

public class MainYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Year year = new Year();
		System.out.println("inserisci l'anno:");
		int anno = scanner.nextInt();
		if (year.isLeapYear(anno)) {
			System.out.println("anno bisestile");
		}else {
			System.out.println("anno non bisestile");
		}

	}

}
