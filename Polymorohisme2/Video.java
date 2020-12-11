package Polymorohisme2;

public class Video extends Ouvrage{
	
	private String editeur ;
	private double duree;
	
	public Video(String titre, String dateCreation, boolean ouvrageDisponible,String editeur,double duree) {
		super(titre, dateCreation, ouvrageDisponible);
		
		this.editeur=editeur;
		this.duree=duree;
		
		
	}

	@Override
	public void afficher() {
		System.out.println("editeur :"+ editeur + " titre "+getTitre() + " date de creation "
				+getDateCreation() + " durée " + duree);
		
	}

	
	
	
}
