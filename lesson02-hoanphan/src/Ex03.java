import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = scanner.nextInt();
		isSymmetrical(n);
	}
	public static void isSymmetrical(int n) {
		int reversed = 0;
		int org = n;
		while(n != 0) {
			int digit = n%10 ;
			reversed = reversed * 10 + digit;
			n = n/10;
		}
		if(reversed == org) {
			System.out.println(org+" la so doi xung");
		}
		else 
		   System.out.println(org+" khong phai so doi xung");
			
	}
}
