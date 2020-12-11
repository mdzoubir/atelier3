package Heritage2;

public class Compte {
	private long numeroCompte; 
	private double solde;
	
	
	public Compte(long numeroCompte, double solde) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	public long getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	public void Ajouter(double add){
		this.solde = this.solde + add;
		System.out.println("votre solde : " + solde);
	}
	
	public void Retirer(double out){
		this.solde = this.solde - out;
		System.out.println("votre solde : " + solde);
	}
	public void Afficher(){
		System.out.println("numero de compte : " + numeroCompte);
		System.out.println("solde : " + solde);
	}
	
	
}
