package data;

public class Ex02 {
	public static void main(String[] args) {
		int age=20;
		int year=2000;
		
	
		
		increase(age);
		swap(age,year);
		
		System.out.println("age: "+age);
		System.out.println("year: "+year);
	}
	private static void increase(int age) {
		age+=1;
	}
	
	private static void swap(int f,int s) {
		f+=s;
		s=f-s;
		f-=s;
		
		System.out.println("first:" +f);
		System.out.println("second:" +s);
	}
}
