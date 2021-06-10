package inheritance.functionalinterface_practice;

public class Demo {
	public static void main(String[] args) {
		int[] array = {5,4,16,13,9,15,20};
		Check isEven = (num) -> num % 2 == 0;
		Check isOdd = (num) -> num % 2 != 0;
		Check isP3 = (num) -> num % 3 == 0;
		Check isP5 = (num) -> num % 5 == 0;
		System.out.println(count(array, isEven));
		System.out.println(count(array, isOdd));
		System.out.println(count(array, isP3));
		System.out.println(count(array, isP5));
	}
	
	private static int count(int[] array, Check check) {
		int count = 0;
		for(int num : array) {
			if(check.test(num)) {
				count++;
			}
		}
		return count;
	}
}
