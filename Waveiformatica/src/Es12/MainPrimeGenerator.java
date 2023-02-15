package Es12;

public class MainPrimeGenerator {

	public static void main(String[] args) {
		PrimeGenerator generator = new PrimeGenerator(200);
		
		System.out.println(generator.isPrime(3));
		generator.nextPrime();

	}

}
