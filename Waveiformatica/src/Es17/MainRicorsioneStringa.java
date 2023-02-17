package Es17;

public class MainRicorsioneStringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RicorsioneStringa ricorsioneStringa = new RicorsioneStringa();
		StringBuilder builder = new StringBuilder("ospedale rosso");
	
		ricorsioneStringa.reverse(builder,0,builder.length()-1);
		System.out.println(builder);

	}

}
