

public class Ex02 {
	public static void main(String[] args) {
		long sum = giaithua(4) + giaithua(7) +giaithua(12)+ giaithua(18);
		System.out.println("Tổng là: " + sum);
	}
	public static long giaithua(int n)
	{
		if(n==1) return 1;
		return n*giaithua(n-1);
	}
}
