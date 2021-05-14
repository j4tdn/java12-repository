import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n = scanner.nextInt();
		if (isPowerOfTwo(n))
			System.out.println(n+" la luy thua cua 2");
		else
			System.out.println(n+" khong phai luy thua cua 2");
	}
	public static boolean isPowerOfTwo(int n) {
		if(n == 0 || n == 1) return true;
		int x = n/2;
		int y = n%2;
		if(y == 1) return false;
		return isPowerOfTwo(x);		
	}

}
