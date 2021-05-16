package data;

public class Ex07Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaration
		int []a=new int[5]; //Tao 5 vung nhơ trên heap
		String []b =new String[4];
		
		a[1]=10; 
		b[3]="Hello";
		
		System.out.println(a[1]);
		System.out.println(b[3]);
		 
		int[] c=new int[] {3,4,5,6};
		
		System.out.println("=============");
		for(int citem:c) {
			System.out.println(citem);
		}
		
		System.out.println("=============");
		for(String x: b) {
			System.out.println(x);
		}
	}

}
