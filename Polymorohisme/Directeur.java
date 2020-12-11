package Polymorohisme;

public class Directeur extends Chef{
	private String societe;
	
	
	public Directeur(String nom, String prenom, String adresse, String vill,int dateNaissance, double salaire, String service,String societe) {
		super(nom, prenom, adresse, vill, dateNaissance, salaire, service);
		
		this.societe=societe;
	}


	
	public String getSociete() {
		return societe;
	}



	public void setSociete(String societe) {
		this.societe = societe;
	}



	@Override
	public void afficher() {
		
		System.out.println("Directeur :" + " nom " + getNom() + " prenom " + getPrenom() + " adresse " + getAdresse() + " ville " + getVille()
				+ "date de Naissance "+ getDateNaissance() + " service "+ getSalaire() + " service " + getService() + " societe " + societe);
		
	}
	
	
	
	
}
