package Es05;

public class Time {
	
	private double giorni;
	private double ore;
	private double minuti;
	private double secondi;
	
	public Time(double giorni, double ore, double minuti, double secondi) {
		this.giorni = giorni;
		this.ore = ore;
		this.minuti = minuti;
		this.secondi = secondi;
	}
	
	
	public Time(double secondi) {
		this.secondi = secondi;
	}
	


	public double getGiorni() {
		return giorni;
	}


	public void setGiorni(double giorni) {
		this.giorni = giorni;
	}


	public double getOre() {
		return ore;
	}


	public void setOre(double ore) {
		this.ore = ore;
	}


	public double getMinuti() {
		return minuti;
	}


	public void setMinuti(double minuti) {
		this.minuti = minuti;
	}


	public double getSecondi() {
		return secondi;
	}


	public void setSecondi(double secondi) {
		this.secondi = secondi;
	}


	public double totaleSecondi() {
		double totale = (giorni*86400)+ (ore*3600) + (minuti*60) + secondi;
		return totale;
	}
	
	public void conversione() {
		giorni();
		ore();
		minuti();
		secondi();
		
	}
	
	public double giorni() {
		 setGiorni((secondi/86400));
		return giorni;

    }
	public double ore() {
		 setOre((secondi/3600 ));
		return ore;

    }
	public double minuti() {
		 setMinuti((secondi/60));
		return minuti;

    }
	public double secondi() {
		return secondi;

    }


	@Override
	public String toString() {
		return "Time [giorni=" + giorni + ", ore=" + ore + ", minuti=" + minuti + ", secondi=" + secondi + "]";
	}
	
	
	
	
	
	
	
	
	

}
