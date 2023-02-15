package Es03;

import java.util.Scanner;

public class Automobile {

	private double resa;
	private double carburante;
	private double maxCarburante;


	public Automobile(double resa,double maxCarburante) {
		this.resa = resa;
		this.carburante = 0;
		this.maxCarburante = maxCarburante;
	}
	

	public double getCarburante() {
		return carburante;
	}

	public void setCarburante(double carburante) {
		this.carburante = carburante;
	}

	public void addCarburante(double prezzoBenzinal,String quantità) {
		switch (quantità) {
		case "pieno":
			if (carburante<=maxCarburante) {
				double prezzo = prezzoBenzinal*(maxCarburante-carburante);
				this.carburante += (maxCarburante-carburante);
				System.out.println("il costo è di: " + prezzo + "€");
			}else {
				System.out.println("stai inserendo troppa benzina");
			}
			break;
		case "50":
			if ((50/prezzoBenzinal)<=(maxCarburante-carburante)) {
				this.carburante += (50/prezzoBenzinal);
			}else {
				System.out.println("stai inserendo troppa benzina");
			}
			
			break;
		case "20":
			if ((20/prezzoBenzinal)<=(maxCarburante-carburante)) {
				this.carburante += (20/prezzoBenzinal);
			}else {
				System.out.println("stai inserendo troppa benzina");
			}
			break;
		case "10":
			if ((10/prezzoBenzinal)<=(maxCarburante-carburante)) {
				this.carburante += (10/prezzoBenzinal);
			}else {
				System.out.println("stai inserendo troppa benzina");
			}
			break;
		case "5":
			if ((5/prezzoBenzinal)<=(maxCarburante-carburante)) {
				this.carburante += (5/prezzoBenzinal);
			}else {
				System.out.println("stai inserendo troppa benzina");
			}
			break;
		default:
			System.out.println("Valore inserito non valido");
		}
	}

	public void drive(double percorso) {
		if (carburante >= (percorso / resa)) {
			setCarburante(carburante - (percorso / resa));
		} else {
			System.out.println("carburante insufficiente");
		}
	}

}
