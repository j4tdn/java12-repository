package demo;

import bean.CarAdv;

public class Ex04 {
	public static void main(String[] args) {
		// Demo static

		CarAdv c1 = new CarAdv(1, "Green");
		CarAdv c2 = new CarAdv(2, "White");
		CarAdv c3 = new CarAdv(3, "Pink");

		CarAdv.model = "Audi";
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);

	}
}
