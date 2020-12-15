package Polymorohisme2;

public  class Livre extends Ouvrage{
	private String auteur;
	public Livre(String titre, String dateCreation, String auteur) {
		super(titre, dateCreation);
		this.auteur= auteur;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
	@Override
	void afficher(){
		System.out.println("titre : "+ getTitre() + " date de creation : "+ getDateCreation() + " auteur : " + auteur );
	}
	
	
	
}
