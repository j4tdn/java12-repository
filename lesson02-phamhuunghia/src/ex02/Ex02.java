package ex02;

public class Ex02 {
	public static void main(String[] args) {
	int []arr=new int[] {4,7,12,18};
	long s=0;
	int arrLength=arr.length;
	for(int i=0;i<arrLength;i++) {
		s += giaiThua(arr[i]);
	}
	System.out.println("S = 4! +7! + 12! + 18! =" +s );
		
	}
	
	public static long giaiThua(int n) {
		{
		    if (n == 1)
		        return 1;
		    return n * giaiThua(n - 1);
		}
	}
}
