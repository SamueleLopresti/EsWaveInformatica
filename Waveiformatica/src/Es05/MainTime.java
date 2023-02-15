package Es05;

public class MainTime {
	public static void main (String [] args) {
		Time ora = new  Time(5, 5, 5, 5);
		Time domani = new Time(10_000);
		System.out.println(ora.totaleSecondi() + " secondi");
		domani.conversione();
		System.out.println(domani.toString());
		
		
		
	}

}
