package Es16;

import java.util.Arrays;

public class Ricorsione {

	public  boolean controllo(String gigio[]) {

		if (gigio == null || gigio.length == 0) {
			return false;

		} else {
			try {

				Integer.parseInt(gigio[0]);

				return true;
			} catch (NumberFormatException e) {

			}
			String[] copia = Arrays.copyOfRange(gigio, 1, gigio.length);
			return controllo(copia);
		}

	}

}
