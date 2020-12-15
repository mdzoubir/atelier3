package Polymorohisme2;

import java.util.HashMap;


public class Bibliotheque {
	
	HashMap<String, Ouvrage> listOuvrage = new HashMap<String, Ouvrage>();
	HashMap<String, Abonne> listAbonne = new HashMap<String, Abonne>();
	
	
	void ajouterOuvrage(Ouvrage titre){
			if(!listOuvrage.containsKey(titre.getTitre())){
				listOuvrage.put(titre.getTitre(), titre);
			}else{
				System.out.println("ouvrage is aready exist");
			}
	}
	
	public Ouvrage getOuvrage(String titre){
		return listOuvrage.get(titre);
	}
	
	void ajouterAbonne(Abonne nom){
		if (!listAbonne.containsKey(nom.getNom())) {
			listAbonne.put(nom.getNom(), nom);
		}else System.out.println("abonne already exist");
	}	

	Abonne getAbonne(int id){
		for (int i=0; i<listAbonne.size(); i++ ) {
			if(listAbonne.get(i).getId() == id){
				return listAbonne.get(i);
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
}
