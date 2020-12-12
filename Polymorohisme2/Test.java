package Polymorohisme2;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		//Livre
		Livre a = new  Livre("dark", "2009/09/07", "sion bile");
		ArrayList<Livre> tableLivre = new ArrayList<Livre>();
		tableLivre.add(a);
		
		for (int i = 0; i < tableLivre.size(); i++) {
			tableLivre.get(i).afficher();
		}
		//
		
		
		//Video
		Video b = new Video("Maek", "2020/09/12", "Sob", 120);
		ArrayList<Video> tableVideo = new ArrayList<Video>();
		tableVideo.add(b);
		
		for (int i = 0; i < tableVideo.size(); i++) {
			tableVideo.get(i).afficher();
		}
		//
		
		//bibl
		Bibliotheque c = new Bibliotheque();
		c.geterOvrage("tableVideo");
		
	}
}
