package Bai5;

public class IBook {
	String maSach;
	int dongia;
	String NXB;

	public IBook() {
	}

	public IBook(String maSach, int dongia, String nXB) {
		super();
		this.maSach = maSach;
		this.dongia = dongia;
		NXB = nXB;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public int getDongia() {
		return dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}

	@Override
	public String toString() {
		return "Book [Masach=" + maSach + ", dongia=" + dongia + ", NXB=" + NXB + "]";
	}

	public int money() {
		return dongia;
	}

}



