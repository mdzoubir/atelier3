package Heritage2;

public class Epargne extends Compte{
	public Epargne(long numeroCompte, double solde) {
		super(numeroCompte, solde);
		// TODO Auto-generated constructor stub
	}

	double interet;

	public double getInteret() {
		return interet;
	}

	public void setInteret(double interet) {
		this.interet = interet;
	}
	
	public void calculer(){
		if(getSolde()<200){
			System.out.println("la valeur minimale du solde est 200 MAD");
		}else{
			if(interet <1){
				this.interet = interet;
			}else {
				this.interet = interet / 100;
			}
			double h= getSolde() + (getSolde()*interet);
			System.out.println("votre nouveau solde : "+ h );
		}
	}
	

}
