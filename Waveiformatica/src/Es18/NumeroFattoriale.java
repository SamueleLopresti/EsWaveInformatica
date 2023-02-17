package Es18;

public class NumeroFattoriale {
	
	public long fattoriale (long fattore) {
		if (fattore == 0) {
			return 1;
			
		}else {
			try {
				long risultato = fattore * fattoriale(fattore-1);
				return risultato;
			} catch (Exception e) {
				return 404;
			}
		}
	}

}
