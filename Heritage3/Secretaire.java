package Heritage3;

public class Secretaire extends Personne{
	

	private String numeroBureau;
	
	
	public Secretaire(String nom, String prenom, String adresse, String ville,
			int dateNaissance,String numeroBureau) {
		super(nom, prenom, adresse, ville, dateNaissance);
		
		this.numeroBureau=numeroBureau;
		
	}


	@Override
	public String toString() {
		return "numeroBureau=" + numeroBureau;
	}


	@Override
	void ecrirePersonne() {
		System.out.println("Secretaire :" + toString() + " " + toString());
		
	}
	
	
	
	
}
