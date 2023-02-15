package Es06;

import java.util.Scanner;


public class MainReverseTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseTime time = new ReverseTime();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Secondi da convertire:");
		double secondi = scanner.nextDouble();
		time.giorni(secondi);
		time.ore(secondi);
		time.minuti(secondi);
		time.secondi(secondi);
		
		
		
		

	}

}
