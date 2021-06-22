package exercise04;

public class People {
protected String hoVaTen;
protected int namSinh;
protected float heSoLuong;
public People() {
	super();
}
public People(String hoVaTen, int namSinh, float heSoLuong) {
	super();
	this.hoVaTen = hoVaTen;
	this.namSinh = namSinh;
	this.heSoLuong = heSoLuong;
}
public String getHoVaTen() {
	return hoVaTen;
}
public void setHoVaTen(String hoVaTen) {
	this.hoVaTen = hoVaTen;
}
public int getNamSinh() {
	return namSinh;
}
public void setNamSinh(int namSinh) {
	this.namSinh = namSinh;
}
public float getHeSoLuong() {
	return heSoLuong;
}
public void setHeSoLuong(float heSoLuong) {
	this.heSoLuong = heSoLuong;
}
@Override
public String toString() {
	return "People [hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", heSoLuong=" + heSoLuong + "]";
}

}
