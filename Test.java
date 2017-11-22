package crazyeightBis;
import java.util.*;


public class Test {

	private ArrayList<Carte> deck;
	
	public static ArrayList<Carte> initialiserCarte(ArrayList<Carte> deck){
		
		
		for (int i=0; i<12; i++){
			for (int j=0; j<4; j++){
				//carte(i).numero=i, carte(i).couleur=j
				deck.add(new Carte (i,j));
			}
		}
		return deck;
	}
	
	
	public Carte tirerCarte(){
		
		this.deck=deck;
		Carte carteTiree=deck.get(0);
		//Carte carteTiree =deck.get((int)Math.random()*51);
		deck.remove(carteTiree);
		return carteTiree;
	}

	
	public static void main(String[] args) {
		Test test = new Test();
		ArrayList<Carte> deck = new ArrayList<Carte>();
		ArrayList<Carte> deck2 = new ArrayList<Carte>();
		deck2=initialiserCarte(deck);
		Carte carteTiree  = test.tirerCarte();
	
	
}
}



