package crazyeightBis;

public class Carte {

private int numero, couleur;
	
	public Carte(int numero, int couleur){
		this.numero=numero;
		this.couleur=couleur;
		System.out.println("carte créée");
	}
	
	
	//getters (pas de setters car on modifie pas les cartes)
	
	public int getNumero() {
		return numero;
	}

	public String getCouleur() {
		if (couleur==0)return "Coeur";
		if (couleur==1)return "Pique";
		if (couleur==2)return "Carreau";
		else return "Trèfle";
		
	}

	//toString : retourne le numero et couleur de la carte (ex : 8 de Coeur)
	public String toString(){
		String sortie;
		if (numero==10) sortie = "Valet";
		else if (numero==11) sortie = "Dame";
		else if (numero==12) sortie = "Roi";
		else sortie = "" + (numero+1);
		return sortie + " de " + getCouleur();
		
	}
	
	public boolean equals(Carte carte){
        if((carte.couleur==this.couleur)&&(carte.numero==this.numero)){
            return true;
        }
        else
        	return false;
    }
	//pour verifier si la carte est jouable ou pas. Changement par rapport au diagramme de classe!!!
	public boolean pouvoirJoue(Carte dessusPile) {
		
		boolean peutJoue=false;
		if((this.numero==dessusPile.numero)||(this.couleur==dessusPile.couleur)){
			peutJoue=true;
		}
		return peutJoue;
	}
	
}
