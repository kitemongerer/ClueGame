package clueGame;

public class Card {
	public String name;
	public CardType type;

	public Card(String name, CardType type) {
		this.name = name;
		this.type = type;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Card)) {
			return false;	
		}
		if (obj == this) {
			return true;
		}
		return this.name.equals(((Card) obj).name);
	}
	
	/*public boolean equals(Card card) {
		System.out.println("I'm being called");
		if (card.name.equals(this.name) && card.type.equals(this.type)) {
			return true;
		}
		return false;
	}*/
}
