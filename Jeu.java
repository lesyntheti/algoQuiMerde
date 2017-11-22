package crazyeightBis;

import java.util.ArrayList;


public class Jeu {

	private Initialisation initialisation;
	private Pioche cartesNonDistribuees;
	private Talon cartesJouees;
	private int nbJoueurs;
	protected ArrayList<Joueur> listeJoueurs = new ArrayList<Joueur>();
	
	
	
	
	
	
	
	
	
	
	
	public Initialisation getInitialisation() {
		return initialisation;
	}
	public void setInitialisation(Initialisation initialisation) {
		this.initialisation = initialisation;
	}
	public Pioche getCartesNonDistribuees() {
		return cartesNonDistribuees;
	}
	public void setCartesNonDistribuees(Pioche cartesNonDistribuees) {
		this.cartesNonDistribuees = cartesNonDistribuees;
	}
	public Talon getCartesJouees() {
		return cartesJouees;
	}
	public void setCartesJouees(Talon cartesJouees) {
		this.cartesJouees = cartesJouees;
	}
	public int getNbJoueurs() {
		return nbJoueurs;
	}
	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	public ArrayList<Joueur> getListeJoueurs() {
		return listeJoueurs;
	}
	public void setListeJoueurs(ArrayList<Joueur> listeJoueurs) {
		this.listeJoueurs = listeJoueurs;
	}
	
	
	

	
	
	
}
