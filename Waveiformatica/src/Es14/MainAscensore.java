package Es14;

import java.util.ArrayList;

public class MainAscensore {

	public static void main(String[] args) {
	Ascensore ascensore = new Ascensore(10, 6);
	ascensore.entra(55, 2);
	ascensore.entra(54, 3);
	ascensore.entra(52, 2);
	ascensore.entra(57, 2);
	ascensore.letturaArray();
System.out.println(ascensore.getNumeroPersoneCorrente());
	
	ascensore.muovi();
	ascensore.muovi();
	ascensore.letturaArray();
	System.out.println(ascensore.toString());
	
	
	}

}
