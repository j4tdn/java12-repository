package ex03;

public class Card {
	private String type;
	public Card(String type, String order) {
		super();
		this.type = type;
		this.order = order;
	}
	private String order;
	
	public Card() {
    }

	@Override
	public String toString() {
		return  order+" "+type;
	}

	public String getType() {
		return type;
	}

	public void setTye(String tye) {
		this.type = tye;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}
	public boolean equals(Object o) 
	{
		if(this == o) {
			return true;
		}
		if(!(o instanceof Card)) {
			return false;
		}
		Card that = (Card)o;
		return (order ==that.getOrder() && type == that.getType());
	}
}
