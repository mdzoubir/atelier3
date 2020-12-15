package Polymorohisme2;

public class Abonne {
	private String nom;
	private int id;
	private int numeroAbonne;
	private boolean seulOuvrage;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroAbonne() {
		return numeroAbonne;
	}
	public void setNumeroAbonne(int numeroAbonne) {
		this.numeroAbonne = numeroAbonne;
	}
	public boolean isSeulOuvrage() {
		return seulOuvrage;
	}
	public void setSeulOuvrage(boolean seulOuvrage) {
		this.seulOuvrage = seulOuvrage;
	}
	public Abonne(String nom, int id, int numeroAbonne) {
		super();
		this.nom = nom;
		this.id = id;
		this.numeroAbonne = numeroAbonne;
	}
	
	
	
	
	
	void afficher(){
		System.out.println("nom : "+ nom + " id : " + id + " numero de abonne : " + numeroAbonne);
	}
	
	
	
}
