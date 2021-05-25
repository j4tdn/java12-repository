package demo;

public class Helper {
	int a, b;
	public static int sum(int a1, int b1) {
		return a1+b1;
	}
	
	public int sum() {
		return a+b;
	}
	
	public Helper(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		System.out.println(sum(10,2)); 
		
		Helper h1=new Helper(1, 2);
		System.out.println(h1.sum());
	}
}
