package Polymorohisme2;

public class Video extends Ouvrage{
	private String editeur;
	private double duree;
	
	public Video(String titre, String dateCreation, String editeur, double duree) {
		super(titre, dateCreation);
		
		this.duree=duree;
		this.editeur = editeur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}
	
	@Override
	void afficher(){
		System.out.println("titre : " + getTitre() + " date de creation : "+ getDateCreation()
				+ " editeur : " + editeur + " duree : " + duree) ;
	}
	
	


	
	
	
}
