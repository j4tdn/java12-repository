package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class VeHicles {
	int n;
	Vehicle[] vh;
	public VeHicles() {
		this.n = 0;
		vh=new Vehicle[0];
	}
	public VeHicles(int n, Vehicle[] vh) {
		this.n = n;
		this.vh = vh;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
		vh=new Vehicle[n];
	}
	public Vehicle[] getVh() {
		return vh;
	}
	public void setVh(Vehicle[] vh) {
		this.vh = vh;
	}
	
	public void SetVeHicles(int n, Vehicle vh[]) {
		this.vh=vh;
		this.n= n;
	}
	@Override
	public String toString() {
		return "VeHicles [n=" + n + ", vh=" + Arrays.toString(vh) + "]";
	}
	
}
