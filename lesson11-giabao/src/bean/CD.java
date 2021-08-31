package bean;

public class CD {
	private int idCD;
	private String CDtype;
	private String singer;
	private int numberSong;
	private double price;
	
	public CD() {
		// TODO Auto-generated constructor stub
	}

	public CD(int idCD, String cDtype, String singer, int numberSong, double price) {
		super();
		this.idCD = idCD;
		CDtype = cDtype;
		this.singer = singer;
		this.numberSong = numberSong;
		this.price = price;
	}

	public int getIdCD() {
		return idCD;
	}

	public void setIdCD(int idCD) {
		this.idCD = idCD;
	}

	public String getCDtype() {
		return CDtype;
	}

	public void setCDtype(String cDtype) {
		CDtype = cDtype;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberSong() {
		return numberSong;
	}

	public void setNumberSong(int numberSong) {
		this.numberSong = numberSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [idCD=" + idCD + ", CDtype=" + CDtype + ", singer=" + singer + ", numberSong=" + numberSong
				+ ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if (!(obj instanceof CD)) {
			return false;
		}
		CD that = (CD)obj;
		return getIdCD() == that.getIdCD();
	}
}
