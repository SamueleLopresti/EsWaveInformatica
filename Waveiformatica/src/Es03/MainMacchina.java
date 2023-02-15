package Es03;

public class MainMacchina {

	public static void main(String[] args) {
		Automobile panda = new Automobile(14.1,30.0);
		
		panda.addCarburante(2,"pieno");
		System.out.println(panda.getCarburante());
		panda.drive(50);
		System.out.println(panda.getCarburante());

	}

}
