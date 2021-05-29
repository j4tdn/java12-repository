package ex02;

public class Vehicle {
	private double gia;
	private String chuSoHuu;
	private int dungTich;
	private String type;
	private double tax;
	
	public Vehicle(String chuSoHuu,String type,  int dungTich,double gia ) {
		this.chuSoHuu = chuSoHuu;
		this.type = type;
		this.dungTich = dungTich;
		this.gia = gia;
		setTax();
	}

	
	public double getGia() {
		return gia;
	}


	@Override
	public String toString() {
		return String.format("%-20s %-15s %-15s %-15.2f %-15.2f",chuSoHuu,type,dungTich,gia,tax);
	}


	public double getTax() {
		return tax;
	}


	
	
	public void setTax() {
		if(dungTich<100)
		{
			this.tax= ( this.gia*(double)1/100);
			return;
		}
		if( dungTich<=200) {
			this.tax=  ( this.gia*(double)3/100);
			return;
		}
		 this.tax= (this.gia*(double)5/100);
		 
	}


	public void setGia(double gia) {
		this.gia = gia;
	}


	public String getChuSoHuu() {
		return chuSoHuu;
	}


	public void setChuSoHuu(String chuSoHuu) {
		this.chuSoHuu = chuSoHuu;
	}


	public int getDungTich() {
		return dungTich;
	}


	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
}
