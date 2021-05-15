package BaiTapjava;

import java.util.ArrayList;
import java.util.Random;

public class Ex07 {
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static Random generator = new Random();
	public static boolean check(ArrayList<Integer> listt,Integer temp)
	{
		for(var item:listt)
		{
			if(item==temp) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Integer n=5;
		while(n>0)
		{
			Integer value = generator.nextInt(11)+20;
					if(check(list, value))
					{
						list.add(value);
						n--;
					}
					else
						continue;	
		}
		for(var item : list)
		{
			System.out.println(item);
		}
	}
}

