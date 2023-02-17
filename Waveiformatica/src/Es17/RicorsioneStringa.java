package Es17;

import java.util.Arrays;

public class RicorsioneStringa {

	
	public void  reverse (StringBuilder  r, int inizio,int fine) {
		 
		
			 
		if(inizio>=fine) {
		return;
		}
			char temp = r.charAt(inizio);
			r.setCharAt(inizio, r.charAt(fine));
			r.setCharAt(fine, temp);
			
		reverse(r,inizio+1,fine-1);
		
	
	}
	
	
	

}
