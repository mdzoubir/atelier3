package Heritage2;

public class Test {
	public static void main(String[] args) {
		Epargne a = new Epargne(2844,2345234567853423L);
		a.setSolde(2844);
		a.setNumeroCompte(2345234567853423L);
		
		a.Afficher();
		a.Retirer(234);
		a.Ajouter(234);
		
		a.setInteret(20);
		a.calculer();
	}
	
}
