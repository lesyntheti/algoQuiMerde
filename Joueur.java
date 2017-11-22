package crazyeightBis;
import java.util.ArrayList;

public class Joueur {

	private String nom;
	private ArrayList<Carte> main;
	
	public Joueur(String nom){
		this.nom=nom;
		this.main = new ArrayList<Carte>();
		//on créé un joueur avec une main vide
	}

	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Carte> getMain() {
		return main;
	}

	public void setMain(ArrayList<Carte> main) {
		this.main = main;
	}
	
	
	
}
