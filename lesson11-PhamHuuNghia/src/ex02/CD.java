package ex02;

public class CD {
	private int Id;
	private String name;
	private String singer;
	private int songAmount;
	private double price;

	@Override
	public boolean equals(Object obj) {
		if (this==obj) return true;
		
		if(!(obj instanceof CD)) {
			return false;
		}
		
		CD that = (CD) obj;
		return this.getId() == that.getId();
	}
	
	public CD(int id, String name, String singer, int songAmount, double price) {
		super();
		Id = id;
		this.name = name;
		this.singer = singer;
		this.songAmount = songAmount;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getSongAmount() {
		return songAmount;
	}

	public void setSongAmount(int songAmount) {
		this.songAmount = songAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [Id=" + Id + ", name=" + name + ", singer=" + singer + ", songAmount=" + songAmount + ", price="
				+ price + "]";
	}
}
