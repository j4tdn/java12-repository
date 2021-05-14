package demo274;

public class Ex02External {
	public static void main(String[] args)
	{
		Ex01TestVM t1 = new Ex01TestVM();
		t1.age=10;
		
		Ex01TestVM t2 = new Ex01TestVM();
		t2.age=20;
		System.out.println("t1 age: "+ t1.age);
		System.out.println("t2 age: "+ t2.age);

	}
}

