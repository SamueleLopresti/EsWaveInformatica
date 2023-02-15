package Es07;

import java.util.Scanner;

public class MainRisposta {
	public static String risposta(String immessa) {
		if (immessa.equalsIgnoreCase("s") || immessa.equalsIgnoreCase("si") || immessa.equalsIgnoreCase("ok")
				|| immessa.equalsIgnoreCase("certo") || immessa.equalsIgnoreCase("perchè no?")) {
			return "ok";
		} else if (immessa.equalsIgnoreCase("n") || immessa.equalsIgnoreCase("no")) {
			return "fine";
		} else {
			return "Dato non corretto";
		}
	}

	public static String risposta1(String immessa) {

		switch (immessa) {
		case "s": {
			return "ok";
		}

		case "si":
			return "ok";

		case "ok":
			return "ok";

		case "certo":
			return "ok";

		case "perchè no?":
			return "ok";

		case "n":
			return "fine";

		case "no":
			return "fine";

		default:
			return "Dato non corretto";

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vuoi continuare?");
		String risposta = scanner.nextLine();
		System.out.println(MainRisposta.risposta(risposta));
		///System.out.println(MainRisposta.risposta1(risposta));

	}

}
