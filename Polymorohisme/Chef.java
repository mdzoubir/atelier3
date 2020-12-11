package Polymorohisme;

public class Chef extends Employe{
	private String service; 
	public Chef(String nom, String prenom, String adresse, String vill,
			int dateNaissance, double salaire,String service) {
		super(nom, prenom, adresse, vill, dateNaissance, salaire);
		
		this.service=service;
	}
	
	
	public String getService() {
		return service;
	}


	public void setService(String service) {
		this.service = service;
	}


	@Override
	public void afficher() {
		
		System.out.println("Chef :"+ " nom " + getNom() + " prenom " + getPrenom() + " adresse " + getAdresse() + " ville " + getVille()
				+ "date de Naissance "+ getDateNaissance() + " service "+ getSalaire() + " service " + service);
		
	}
	
	

}
