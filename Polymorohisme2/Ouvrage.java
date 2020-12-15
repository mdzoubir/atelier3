package Polymorohisme2;

public  class Ouvrage {
	private String titre;
	private String dateCreation;
	private boolean ouvrageDispo;
	
	
	
	
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
	public boolean isOuvrageDispo() {
		return ouvrageDispo;
	}
	public void setOuvrageDispo(boolean ouvrageDispo) {
		this.ouvrageDispo = ouvrageDispo;
	}
	
	
	
	void afficher(){
		System.out.println("titre : " + titre  + " date de creation " + dateCreation ) ;
	}
	
}
