package Es19;

/*
 * Es. 19 

Una biblioteca ha dato l’incarico di implementare un software per la gestione dei prestiti di libri. 
Si costruiscano le seguenti classi: 

Data: serve per costruire “l’orologio” virtuale. 

Implementare tre variabili d’istanza e i metodi: 

int getDay(),
int getMonth(), 
int getYear(),
void setDay(int aDay), 
void setMonth(int aMonth), 
void setYear(int aYear), 
void nextDay(), 
xBoolean isEqual(Data date). 
 */

public class Data {

	private int day;
	private int month;
	private int year;
	
	
	
	public Data() {
	}
	public Data(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month<12) {
			this.month = month;
		}else {
			setYear(getYear()+1);
			this.month = month-12;
		}
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void nextDay () {
		this.day =+ 1;
	}
	//date.getDay()==this.day && date.getMonth()==this.month && date.getYear()== this.year
	public boolean isEqual(Data date) {
		if (date.toString() == this.toString()) {
			return true;
		}else {
		return false;
		}
		
	}
	@Override
	public String toString() {
		return "Data [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	

}
