package data;

public class Ex06Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Digit d1=new Digit(30);
      Digit d2=new Digit(20);
      swap(d1,d2);
      System.out.println("d1:"+d1);
       System.out.println("d2:"+d2);
	}
   private static void swap(Digit first,Digit Second) {
	   Digit tmp=new Digit(10);
	   tmp.value=first.value;
	   first.value=Second.value;
	   Second.value=tmp.value;
   }
}
