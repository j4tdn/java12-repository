import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int n;
		
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int f = n;
		int m = n,count=0;
	
		while (f != 0) {
			f /= 10;
			count++;
		}
		
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = m % 10;
			m /= 10;
		}
		Arrays.sort(arr);
	
			
			System.out.println(arr[1]);
		
//		int count1 = 0;
//		for (int i = 0; i < count - 1; i++) {
//			if (arr[i] != arr[i + 1])
//				++count1;
//		}
//		if (count1 > 2)
//		

		
	}

}
