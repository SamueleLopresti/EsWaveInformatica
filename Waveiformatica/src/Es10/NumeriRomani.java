package Es10;

import java.util.Iterator;

public class NumeriRomani {
	int migliaia = 0;
	int centinaia = 0;
	int decine = 0;
	int unità = 0;
	
	public void convertitoreRandom() {
		int numeroRandom = (int) (Math.random()*100);
		migliaia = numeroRandom/1000;
		centinaia = (numeroRandom -(migliaia*1000)) / 100;
		decine = (numeroRandom - ((centinaia * 100)+(migliaia*1000))) / 10;
		unità = (numeroRandom - ((decine * 10) + (centinaia * 100)+(migliaia*1000))) / 1;
		System.out.println(migliaia);
		System.out.println(centinaia);
		System.out.println(decine);
		System.out.println(unità);
		String migl = "";
		String cent = "";
		String dec = "";
		String un = "";
		
		if(migliaia <=3) {
			for (int i = 1; i <= migliaia; i++) {
				migl = migl.concat("M");
			}
		}

		if (centinaia == 5) {
			cent = "D";
		}else if (centinaia == 4) {
			cent ="CD";
		}else if(centinaia <= 3) {
			for (int i = 1; i <= centinaia; i++) {
				dec = dec.concat("C");
			}
		}else if (centinaia > 5 && centinaia < 9) {
			cent = "D";
			for (int i = 1; i <= (centinaia - 5); i++) {
				cent = cent.concat("C");
			}
		}else {
			cent="CM";
		}
		
		if (decine == 5) {
			dec = "L";
		} else if (decine == 4) {
			dec = "XL";

		} else if (decine <= 3) {
			for (int i = 1; i <= decine; i++) {
				dec = dec.concat("X");
			}

		} else if (decine > 5 && decine < 9) {
			dec = "L";
			for (int i = 1; i <= (decine - 5); i++) {
				dec = dec.concat("X");
			}
		}else {
			dec="XC";
		}
		
		if (unità == 5) {
			un = "V";
		} else if (unità == 4) {
			un = "IV";

		} else if (unità <= 3) {
			for (int i = 1; i <= unità; i++) {
				un = un.concat("I");
			}
		} else if (unità > 5 && decine < 9) {
			un = "V";
			for (int i = 1; i <= (unità - 5); i++) {
				un = un.concat("I");
			}
		} else {
			un="IX";
		}
		
		System.out.print(migl.concat(cent).concat(dec).concat(un));
		System.out.println();
		
		//throw new IllegalArgumentException("Unexpected value: ")
		switch (migliaia) {
		case 0: migl = "";break;
		case 1: migl = "M";break;
		case 2: migl = "MM";break;
		case 3: cent = "MMM";break;
		default:
			System.out.println("Inserito un valore non valido");
			}
		
		
		switch (centinaia) {
		case 0: cent = "";break;
		case 1: cent = "C";break;
		case 2: cent = "CC";break;
		case 3: cent = "CCC";break;
		case 4: cent = "CD";break;
		case 5: cent = "D";break;
		case 6: cent = "DC";break;
		case 7: cent = "DCC";break;
		case 8: cent = "DCCC";break;
		case 9: cent = "CM";break;
		default:
			System.out.println("Inserito un valore non valido");
			}
		
	
		
		switch (decine) {
		
		case 0: dec = "";break;
		case 1: dec = "X";break;
		case 2: dec = "XX";break;
		case 3: dec = "XXX";break;
		case 4: dec = "XL";break;
		case 5: dec = "L";break;
		case 6: dec = "LX";break;
		case 7: dec = "LXX";break;
		case 8: dec = "LXXX";break;
		case 9: dec = "XC";break;
		default:
			System.out.println("Inserito un valore non valido");
		}
		
		
		switch (unità) {
		case 0: un = "";break;
		case 1: un = "I";break;
		case 2: un = "II";break;
		case 3: un = "III";break;
		case 4: un = "IV";break;
		case 5: un = "V";break;
		case 6: un = "VI";break;
		case 7: un = "VII";break;
		case 8: un = "VIII";break;
		case 9: un = "IX";break;
		default:
			System.out.println("Inserito un valore non valido");
		}
		System.out.print(migl.concat(cent).concat(dec).concat(un));
		System.out.println();
	}
	
	public void convertitoreArabo_Romano(int convertire) {
		migliaia = convertire/1000;
		centinaia = (convertire -(migliaia*1000)) / 100;
		decine = (convertire - ((centinaia * 100)+(migliaia*1000))) / 10;
		unità = (convertire - ((decine * 10) + (centinaia * 100)+(migliaia*1000))) / 1;
		System.out.println(migliaia);
		System.out.println(centinaia);
		System.out.println(decine);
		System.out.println(unità);
		String migl = "";
		String cent = "";
		String dec = "";
		String un = "";
		
		if(migliaia <=3) {
			for (int i = 1; i <= migliaia; i++) {
				migl = migl.concat("M");
			}
		}

		if (centinaia == 5) {
			cent = "D";
		}else if (centinaia == 4) {
			cent ="CD";
		}else if(centinaia <= 3) {
			for (int i = 1; i <= centinaia; i++) {
				dec = dec.concat("C");
			}
		}else if (centinaia > 5 && centinaia < 9) {
			cent = "D";
			for (int i = 1; i <= (centinaia - 5); i++) {
				cent = cent.concat("C");
			}
		}else {
			cent="CM";
		}
		
		if (decine == 5) {
			dec = "L";
		} else if (decine == 4) {
			dec = "XL";

		} else if (decine <= 3) {
			for (int i = 1; i <= decine; i++) {
				dec = dec.concat("X");
			}

		} else if (decine > 5 && decine < 9) {
			dec = "L";
			for (int i = 1; i <= (decine - 5); i++) {
				dec = dec.concat("X");
			}
		}else {
			dec="XC";
		}
		
		if (unità == 5) {
			un = "V";
		} else if (unità == 4) {
			un = "IV";

		} else if (unità <= 3) {
			for (int i = 1; i <= unità; i++) {
				un = un.concat("I");
			}
		} else if (unità > 5 && decine < 9) {
			un = "V";
			for (int i = 1; i <= (unità - 5); i++) {
				un = un.concat("I");
			}
		} else {
			un="IX";
		}
		
		System.out.print(migl.concat(cent).concat(dec).concat(un));
		System.out.println();
		
		//throw new IllegalArgumentException("Unexpected value: ")
		switch (migliaia) {
		case 0: migl = "";break;
		case 1: migl = "M";break;
		case 2: migl = "MM";break;
		case 3: cent = "MMM";break;
		default:
			System.out.println("Inserito un valore non valido");
			}
		
		
		switch (centinaia) {
		case 0: cent = "";break;
		case 1: cent = "C";break;
		case 2: cent = "CC";break;
		case 3: cent = "CCC";break;
		case 4: cent = "CD";break;
		case 5: cent = "D";break;
		case 6: cent = "DC";break;
		case 7: cent = "DCC";break;
		case 8: cent = "DCCC";break;
		case 9: cent = "CM";break;
		default:
			System.out.println("Inserito un valore non valido");
			}
		
	
		
		switch (decine) {
		
		case 0: dec = "";break;
		case 1: dec = "X";break;
		case 2: dec = "XX";break;
		case 3: dec = "XXX";break;
		case 4: dec = "XL";break;
		case 5: dec = "L";break;
		case 6: dec = "LX";break;
		case 7: dec = "LXX";break;
		case 8: dec = "LXXX";break;
		case 9: dec = "XC";break;
		default:
			System.out.println("Inserito un valore non valido");
		}
		
		
		switch (unità) {
		case 0: un = "";break;
		case 1: un = "I";break;
		case 2: un = "II";break;
		case 3: un = "III";break;
		case 4: un = "IV";break;
		case 5: un = "V";break;
		case 6: un = "VI";break;
		case 7: un = "VII";break;
		case 8: un = "VIII";break;
		case 9: un = "IX";break;
		default:
			System.out.println("Inserito un valore non valido");
		}
		System.out.print(migl.concat(cent).concat(dec).concat(un));
		System.out.println();
		
	}

}
