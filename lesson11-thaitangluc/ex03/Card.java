package ex03;

public class Card {
	private Order order;
	private Type type;
	
	public Card() {
	}
	
	public Card(Order order, Type type) {
		this.type = type;
		this.order = order;
	}

	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return order + "-" + type;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if(!(obj instanceof Card)) return false;
		Card that = (Card) obj;
		return this.order == that.order && this.type == that.type;
	}
	
}
