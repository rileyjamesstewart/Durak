
public class Card {
			
	private int number;
	private String suit;
	public Card(int number, String suit) {
		this.setNumber(number);
		this.setSuit(suit);
	}
	///////////GETTERS & SETTERS/////////////////////
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		
		return this.number;
		
	}
	public void setSuit(String suit) {
		
		this.suit = suit;
		
	}
	public String getSuit() {
		
		return this.suit;
		
	}
	/////////////////////////////////////////////////
	
}
