package bean;

public class Card<T> {
	public enum Type{
		Heart,
		Diamond,
		Club,
		Spade,
	}
	private Type type;
	private T symbol;
	public Card() {
		// TODO Auto-generated constructor stub
	}
	public Card(Type type, T symbol) {
		super();
		this.type = type;
		this.symbol = symbol;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public T getSymbol() {
		return symbol;
	}
	public void setSymbol(T symbol) {
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		return "Card [type=" + type + ", symbol=" + symbol + "]";
	}
	
	
}
