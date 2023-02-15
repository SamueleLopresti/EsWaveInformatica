package Es13;

import java.util.ArrayList;

public class Purse {
	private ArrayList<String> b = new ArrayList<String>();

	
	
	public void addCoin (String coinName) {
		b.add(coinName);
	}



	public ArrayList<String> getB() {
		return b;
	}



	public void setB(ArrayList<String> b) {
		this.b = b;
	}



	
	

}
