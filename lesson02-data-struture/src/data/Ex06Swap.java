package data;


//Swap phải tạo 1 class riêng
public class Ex06Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digit d1=new Digit(10);
		Digit d2=new Digit(20);
		
		swap(d1,d2);
		System.out.println(d1);
		System.out.println(d2);
	}
	private static void swap(Digit first, Digit seconds) {
//		Digit tmp=first;
//		first=seconds;   => Ko hoạt động
//		seconds=tmp;
		
		int tmp=first.value;
		first.value=seconds.value;
		seconds.value=tmp;
	}
}
