package ex05;

public class TextBook extends Book {
	boolean tinhtrang; // true: mới, false:cũ

	public TextBook() {
	}

	public TextBook(String maSach, int dongia, String nXB, boolean tinhtrang) {
		super(maSach, dongia, nXB);
		this.tinhtrang = tinhtrang;
	}

	public boolean isTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(boolean tinhtrang) {
		this.tinhtrang = tinhtrang;
	}

	@Override
	public String toString() {
		return "TextBook [MaSach=" + maSach + ", dongia=" + dongia + ", NXB=" + NXB + ", tinhtrang=" + tinhtrang + "]";
	}

	public int money() {
		if (!tinhtrang) {
			return dongia * 70 / 1000;
		}
		return dongia;
	}

}
