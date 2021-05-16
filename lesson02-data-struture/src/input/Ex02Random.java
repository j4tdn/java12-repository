package input;

import java.util.Random;

public class Ex02Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bound=20;
		int a=66;
		int b=88;
		
		Random rd=new Random();
		int r1=rd.nextInt(); //Integer.Min - Integer.Max
		int r2= rd.nextInt(bound);
		int r3= a+rd.nextInt(b-a+1);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		//random 1 elemnent in array
		String[] text= {"x","y","z","t"};
		int r4= rd.nextInt(text.length);
		System.out.println(text[r4]);
		
		//random 1 number has 3 digit
		int r5= 100+ rd.nextInt(999-100+1);
		
		//random a sequence has 3 charater of digit
		String r6=""+ rd.nextInt(10)+
				rd.nextInt(10)+
				rd.nextInt(10);
		System.out.println(r6);
	}

}
