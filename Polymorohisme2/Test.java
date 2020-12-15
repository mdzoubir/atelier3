package Polymorohisme2;

public class Test {
	public static void main(String[] args) {
		Ouvrage ouvrage1 = new Ouvrage("son", "2010/09/07");
		Livre livr1 = new Livre("kan", "2019/08/22", "maik");
		Video video1 = new Video("bik", "2018", "bil", 120) ;
		
		Abonne user1 = new  Abonne("younnes", 1, 110);
		
		//livr1.afficher();
		//video1.afficher();
		
		
		Bibliotheque bi1 = new Bibliotheque();
		bi1.ajouterOuvrage(ouvrage1);
		bi1.ajouterOuvrage(livr1);
		
		bi1.getOuvrage("son").afficher();
		bi1.getOuvrage("kan").afficher();
		
		
		
		bi1.ajouterAbonne(user1);
		
		Abonne r = bi1.getAbonne(user1.getId());
		//System.out.println(user1.getId());
		//System.out.println(r);
		
		r.afficher();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
