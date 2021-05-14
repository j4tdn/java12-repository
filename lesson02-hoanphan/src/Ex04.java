import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
			int n;
		    int maxOdd = 0;
		    Scanner scanner = new Scanner(System.in);
		         
		    do {
		        System.out.println("Nhập vào số phần tử của mảng: ");
		        n = scanner.nextInt();
		    } while (n <= 0);
		         
		    int A[] = new int[n];
		    for (int i = 0; i < n; i++) {
		        System.out.print("Nhập phần tử thứ " + i + ": ");
		        A[i] = scanner.nextInt();
		    }
		    maxOdd = maxOdd(A, n);
	        System.out.print("gia tri le lon nhat cua mang la: "+maxOdd);
	
		    
		      
	}
	public static int maxOdd(int a[], int n)
	{
	    int max = a[0];
	    for (int i = 1; i < n; i++)
	        if (max < a[i] && a[i]%2 != 0)
	            max = a[i];
	    return max;
	}
}
