import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Durakdeck {
	Card master;
	List<Card> deck;
	String[] suits= {"Spade", "Club", "Diamond", "Heart"};
	public Durakdeck(int size) {
		this.deck = new ArrayList<Card>();
		int maxnumber = size/4;
		int i, j;
		for(i = 1; i <= maxnumber; i++) {
			for(j = 0; j < 4; j++) {
				deck.add(new Card(i+(52-size)/4, suits[j]));
			}
		}
		Collections.shuffle(deck);
		master = this.deck.remove(0);
	}
	public Card pop() {
		return this.deck.remove(0);
	}
}
