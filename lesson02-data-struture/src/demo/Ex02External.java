package demo;

public class Ex02External {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01TestVM t1=new Ex01TestVM();
		t1.age = 10;
		
		Ex01TestVM t2=new Ex01TestVM();
		t1.age = 20;
		
		System.out.println("t1:"+t1.age);
		System.out.println("t2:"+t2.age);
	}

}
