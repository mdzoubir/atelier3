package Polymorohisme2;

public class Livre extends Ouvrage{
	

	private String auteur;
	
	
	public Livre(String titre, String dateCreation,  String autuer) {
		super(titre, dateCreation);
		this.auteur=autuer;
	}
	
	
	@Override
	public void afficher(){
		System.out.println("auteur :"+ auteur + " titre "+getTitre() + " date de creation "
			+getDateCreation());
	}
	
	
	
}
