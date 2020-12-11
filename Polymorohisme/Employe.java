package Polymorohisme;

public class Employe extends Personne{
	
private double salaire;
	
	public Employe(String nom, String prenom, String adresse, String vill,
			int dateNaissance,double salaire) {
		super(nom, prenom, adresse, vill, dateNaissance);
		
		this.salaire=salaire;
	}

	
	
	
	public double getSalaire() {
		return salaire;
	}




	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}




	@Override
	public void afficher() {
		
		System.out.println("Employe :" + " nom " + getNom() + " prenom " + getPrenom() + " adresse " + getAdresse() + " ville " + getVille()
				+ "date de Naissance "+ getDateNaissance() + " salaire "+ salaire);
		
	}
	
	
	
}
	



