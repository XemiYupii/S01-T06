package n1exercici1;

public class NoGenericMethods {

	private String nom;
	private String primerCognom;
	private String segonCognom;
	
	public NoGenericMethods (String nom, String primerCognom, String segonCognom) {
		this.nom = nom;
		this.primerCognom = primerCognom;
		this.segonCognom = segonCognom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrimerCognom() {
		return primerCognom;
	}

	public void setPrimerCognom(String primerCognom) {
		this.primerCognom = primerCognom;
	}

	public String getSegonCognom() {
		return segonCognom;
	}

	public void setSegonCognom(String segonCognom) {
		this.segonCognom = segonCognom;
	}
	
	public String toString() {
		return nom +"  " +primerCognom +"  " +segonCognom;
	}
}
