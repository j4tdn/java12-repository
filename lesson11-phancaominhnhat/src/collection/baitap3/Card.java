package collection.baitap3;


public class Card {
	private int type;
	private int number;
	
	public Card() {
		this.type = (int)(Math.random()*4 + 1);
		this.number = (int)(Math.random()*13 + 1);
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		String name = "";
		
		switch (number) {
			case 1: name = "Ace"; break;
			case 2: name = "Pig"; break;
			case 3: name = "Three"; break;
			case 4: name = "Four"; break;
			case 5: name = "Five"; break;
			case 6: name = "Six"; break;
			case 7: name = "Seven"; break;
			case 8: name = "Eight"; break;
			case 9: name = "Nine"; break;
			case 10: name = "Ten"; break;
			case 11: name = "Jack"; break;
			case 12: name = "Queen"; break;
			case 13: name = "King"; break;
		}
		
		switch (type) {
			case 1: name += " of hearts"; break;
			case 2: name += " of diamonds"; break;
			case 3: name += " of clubs"; break;
			case 4: name += " of spade"; break;
		}
		
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if(!(this instanceof Card)) {
			return false;
		}
		
		Card that = (Card) obj;
		return (getNumber() == that.getNumber()) && (type == that.getType());
	}
}
