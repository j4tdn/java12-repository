package demo;

import bean.CarAdv;


public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarAdv c1=new CarAdv(1,"Green");
		CarAdv c2=new CarAdv(2,"red");
		CarAdv c3=new CarAdv(3,"Blue");
	
		
		CarAdv.model="Audi";
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
