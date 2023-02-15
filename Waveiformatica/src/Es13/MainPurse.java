package Es13;



public class MainPurse {
	public static void main(String[] args) {
		Purse purse = new Purse();
		purse.addCoin("euro");
		purse.addCoin("sterlina");
		purse.addCoin("dollaro");
		purse.addCoin("capibara");
		System.out.println(purse.getB());
		
		
	}

}
