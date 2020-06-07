import java.util.List;
import java.util.ArrayList;

public class Player {
	Durakdeck deck;
	int ID;
	List<Card> hand = new ArrayList<Card>();
	public Player(Durakdeck deck, int playerID) {
		this.deck = deck;
		this.ID = playerID;
		//potentially an error
		
	}
	public void drawCard() {
		this.hand.add(deck.pop());
	}
	public boolean attack() {
		
	}
	public boolean defend()	{
		
	}
	public boolean deflect() {
		
	}
}
