package Es20;

public class Tandem {
	private String myString;
	
	public boolean tandem (String myString, int a) {
		//== myString.length()/2
		if (a== myString.length()/2 ) {
			return true;
		}else {
			if (myString.length()%2==0 ) {
				//if (a<=(myString.length()/2)-1) {
					if (myString.charAt(a)== myString.charAt(a+(myString.length()/2))) {
					}else {
						return false;
					//}
				}	
			}else {
				return false;
			}	
		}
		boolean cavoli = tandem(myString, a+1);
		return cavoli;
		
	}

}
