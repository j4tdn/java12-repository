import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap n: ");
		int n = scanner.nextInt();
		System.out.print("He co so 2 cua so "+n+" la: ");
		decTobinary(n);	
	}

	public static void decTobinary(int n) {
		int[] binarynum = new int[100];
		int i = 0;
		while(n>0) {
			binarynum[i] = n % 2;
			n = n/2;
			i++;
		}
		 for (int j = i - 1; j >= 0; j--) {
		      System.out.print(""+binarynum[j]); 
	}
		 }
}
