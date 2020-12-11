package Heritage3;

public class Test {

	public static void main(String[] args) {
		//Personne per = new Personne("simo", "zoubir", "beni mallal", "beni mallal", 2002);
		//System.out.println(per.toString());
		
		Secretaire sec = new Secretaire("khadija", "khadija", "rabat", "rabat", 1990, "44");
		sec.ecrirePersonne();
		
		Enseignant ens = new Enseignant("youssef", "youssef", "casa", "casa", 1980, "arabe");
		ens.ecrirePersonne();
		

	}

}
