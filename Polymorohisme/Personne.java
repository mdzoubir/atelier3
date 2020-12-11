package Polymorohisme;

public abstract class Personne {
	private String nom,prenom,adresse,ville;
	private int dateNaissance;
	public Personne(String nom, String prenom, String adresse, 
			String ville,int dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.dateNaissance = dateNaissance;
	}
	
	
	
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



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public int getDateNaissance() {
		return dateNaissance;
	}



	public void setDateNaissance(int dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", ville=" + ville + ", dateNaissance="
				+ dateNaissance;
	}



	public abstract void afficher();
	
	
}
