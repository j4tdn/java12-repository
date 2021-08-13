package collection.baitap2;


public class DiskCD {
	private int codeCD;
	private String typeCD;
	private String singer;
	private int amountSong;
	private float costCD;
	
	public DiskCD() {
	}

	public DiskCD(int codeCD, String typeCD, String singer, int amountSong, float costCD) {
		super();
		this.codeCD = codeCD;
		this.typeCD = typeCD;
		this.singer = singer;
		this.amountSong = amountSong;
		this.costCD = costCD;
	}

	public int getCodeCD() {
		return codeCD;
	}

	public void setCodeCD(int codeCD) {
		this.codeCD = codeCD;
	}

	public String getTypeCD() {
		return typeCD;
	}

	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getAmountSong() {
		return amountSong;
	}

	public void setAmountSong(int amountSong) {
		this.amountSong = amountSong;
	}

	public float getCostCD() {
		return costCD;
	}

	public void setCostCD(float costCD) {
		this.costCD = costCD;
	}

	@Override
	public String toString() {
		return "DiskCD [codeCD=" + codeCD + ", typeCD=" + typeCD + ", singer=" + singer + ", amountSong=" + amountSong
				+ ", costCD=" + costCD + "]";
	}
}
