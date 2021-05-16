package input;

import java.util.Random;

public class Ex02Random {

	public static void main(String[] args) {
		int bound=20;
           Random rd=new Random();
          int r1= rd.nextInt();
          int r2=rd.nextInt(bound);//0-(bound-1)
          int r3=66+rd.nextInt(23);
          System.out.println(r1);
          System.out.println(r2);
          System.out.println(r3);
          String[]texts= {"x","y","z","m"};
          System.out.println(texts[rd.nextInt(texts.length)]);
          }
           
	}

