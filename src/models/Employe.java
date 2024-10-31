package models;

public class Employe {
	private String nom;
    private String prenom;
    private String matricule;
    private String adresse;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Employe(String nom, String prenom, String matricule, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.adresse = adresse;
	}
}
