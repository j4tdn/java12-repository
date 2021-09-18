package bean;

public enum Level {
	NOR(20000), VIP(50000);

	private int money;
	
	private Level(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
}
