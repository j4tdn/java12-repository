package bai2;


public class Main {
	public static void main(String[] args) {
		int[] arr = {25, 28, 14, 35, 5, 23, 55, 19, 45};
		int[] newArr = new int[arr.length];
		int head = 0;
		int last = arr.length - 1;
		
		for(int i = 0; i < arr.length; i++) {			
			if(arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				newArr[head] = arr[i];
				head++;
				arr[i] = 0;
			}
			
			if(arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				newArr[last] = arr[i];
				last--;
				arr[i] = 0;
			}
		}
		
		for(int i = head; i <= last; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] != 0) {
					newArr[i] = arr[j];
					arr[j] = 0;
					break;
				}
			}
		}
		
		for(int i : newArr) {
			System.out.print(i + " ");
		}
	}
}
