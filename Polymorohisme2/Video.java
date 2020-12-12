package Polymorohisme2;


public class Video extends Ouvrage{
	
	private String editeur ;
	private double duree;
	
	public Video(String titre, String dateCreation, String editeur,double duree) {
		super(titre, dateCreation);
		
		this.editeur=editeur;
		this.duree=duree;
		
		
	}

	@Override
	public void afficher() {
		System.out.println("editeur :"+ editeur + " titre "+getTitre() + " date de creation "
				+getDateCreation() + " durée " + duree + "min");
		
	}

	
	
	
	
}
