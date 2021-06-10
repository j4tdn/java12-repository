package Bai5;

public class ReferenceBook extends IBook {
	int thue;

	public ReferenceBook() {
	}

	public ReferenceBook(String maSach, int dongia, String nXB, int thue) {
		super(maSach, dongia, nXB);
		this.thue = thue;
	}

	public int getThue() {
		return thue;
	}

	public void setThue(int thue) {
		this.thue = thue;
	}

	@Override
	public String toString() {
		return "ReferBook [MaSach=" + maSach + ", dongia=" + dongia + ", NXB=" + NXB + ", thue=" + thue + "]";
	}

	@Override
	public int money() {
		return (int) (dongia * (1 + (double) thue / 100));
	}
}