package demo;

public class Ex02External {

	public static void main(String[] args) {
		Ex01Main t1 = new Ex01Main();
		t1.age=10;
		Ex01Main t2=new Ex01Main();
		t2.age=20;
		System.out.println("t1 age: "+t1.age);
		System.out.println("t2 age: "+t2.age);
	}

}
