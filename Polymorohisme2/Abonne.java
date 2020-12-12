package Polymorohisme2;

public class Abonne extends Ouvrage{
	public Abonne(String titre, String dateCreation) {
		super(titre, dateCreation);
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String nom;
	private int numeroAbonne;
	private String ouvBib;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumeroAbonne() {
		return numeroAbonne;
	}
	public void setNumeroAbonne(int numeroAbonne) {
		this.numeroAbonne = numeroAbonne;
	}
	public String getOuvBib() {
		return ouvBib;
	}
	public void setOuvBib(String ouvBib) {
		this.ouvBib = ouvBib;
	}
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
