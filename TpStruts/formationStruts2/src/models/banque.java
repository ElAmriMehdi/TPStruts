package models;

public class banque {
	
	private String libelle;
	private double capital;
	private String adresse;
	
	
	
	public banque() {}
	public banque(String libelle, double capital, String adresse) {
		super();
		this.libelle = libelle;
		this.capital = capital;
		this.adresse = adresse;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	

}
