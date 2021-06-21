package ex02;

public class Main {
	
	public static void main(String[] args) {
		int[] arr= {3, 7, 9, 2, 1, 6, 5, 4, 10};
		//int[] arr2= {3, 2, 1, 6, 5};
		int kq=Funtion.getMissingNumber(arr);
		switch (kq) {
		case 0: {
			
			System.out.println("Ko có phần tử cần tìm ");
		}
		default:
			System.out.println("Phần tử cần tìm có giá trị: "+kq);
		}
	}
}
