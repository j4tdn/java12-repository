package BaiTapjava;

public class Ex02 {
	public static long GiaiThua(Integer x) {
		if(x==0) return 1;
		return x*GiaiThua(x-1);
	}
	public static long Sum(Integer x,Integer n)
	{
		long sum=GiaiThua(x+1);
		Integer sum1=x;
		for(Integer i=1;i<n;i++)
		{
			sum1+=x+i;
			sum+=GiaiThua(sum1);
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Tổng cua 4!+7!+12!+18! là: ");
		System.out.println(Sum(3, 4));
	}
}
