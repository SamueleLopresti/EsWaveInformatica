package Es08;

public class Year {
	public boolean isLeapYear(int anno) {
		if (anno <= 1582) {
			if (anno%4==0) {
				return true;
			}else {
				return false;
			}
		}else {
			if (anno%400==0) {
				return true;
			}else {
				return false;
			}
		}
	}

}
