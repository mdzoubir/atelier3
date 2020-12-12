package Polymorohisme2;


public abstract class Ouvrage {
	private String titre;
	private String  dateCreation;
	private boolean ouvrageDisponible;
	
	
	public Ouvrage(String titre, String dateCreation) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
	}

	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public String getDateCreation() {
		return dateCreation;
	}



	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}



	public boolean isOuvrageDisponible() {
		return ouvrageDisponible;
	}



	public void setOuvrageDisponible(boolean ouvrageDisponible) {
		this.ouvrageDisponible = ouvrageDisponible;
	}



	public abstract void afficher();
	
	
	
}
