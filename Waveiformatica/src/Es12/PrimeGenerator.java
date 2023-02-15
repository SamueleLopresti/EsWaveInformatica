package Es12;

import java.util.Iterator;

public class PrimeGenerator {
	private int inserito;

	public PrimeGenerator(int inserito) {
		this.inserito = inserito;
	}

	public boolean isPrime(int a) {
		boolean primo = false;
		int i = 2;
		while (i<=a && a%i!=0) {
			i++;
		}
		if(i==a) {
			primo = true;
			
			
		}else {
			primo = false;
			
		}
		return primo;
		
	}

	public void nextPrime() {
		
		for (int i = 1; i<=inserito;i++) {
			if(isPrime(i)) {
				 System.out.println(i);//Integer.toString(i); 
				 
			}	
		}
		
		

	}

}
