package Es06;

public class ReverseTime {
	public void giorni(double secondi) {
		double giorni = secondi/86400;
		System.out.println("sono: " + giorni + " giorni");

    }
	public void ore(double secondi) {
		double ore = secondi/3600 ;
		System.out.println("sono: " + ore + " ore");

    }
	public void minuti(double secondi) {
		double minuti = secondi/60 ;
		System.out.println("sono: " + minuti + " minuti" );

    }
	public void secondi(double secondi) {
		System.out.println("sono: " + secondi + " secondi");

    }
}
