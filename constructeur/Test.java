package constructeur;

public class Test {
	public static void main(String[] args) {
		Employer r = new Employer("Mohammad", " El alami", "casa", 1963, 2020);
		Employer r1 = new Employer("Khalid", "El wahabi ", "Safi", 1990 , 2020);
		Employer r2 = new Employer("Fouad", "Sbai", "Sal�", 2006, 2020);
		/*r.setNom("Mohammad");
		r.setAdresse("casa");
		r.setPrenom("El alami");
		r.setAnneeN(1963);
		r.setAnneeE(2020);
		r.afficherInfoClients("Mohammad", " El alami", "casa", 1963, 2020);
		r.afficherInfoClients("Khalid", "El wahabi ", "Safi", 1990 , 2020);
		r.afficherInfoClients("Fouad", "Sbai", "Sal�", 2006, 2020);*/
		r.afficherInfoClients();
		r1.afficherInfoClients();
		r2.afficherInfoClients();
	}
}
