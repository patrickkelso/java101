public class Card {
	private int number;
	private String suit;

	public Card(int number, String suit) {
		this.number = number;
		this.suit = suit;
	}

	public int getNumber() {
		return number;
	}

	public int getValue() {
        return number;
	}

	public String getSuit() { 
		return suit;
	}
}
