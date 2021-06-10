package ex01;

public class Main {
	public static void main(String[] args) {
		int[] arr= {3, 15, 21, 0, 15, 17, 21};
		print(Function.getUniqueNumbers(arr));
	}
	static void print(int []arrInput) {
		sortASC(arrInput);
		for(int i=0;i< arrInput.length;i++) {
			System.out.println(arrInput[i]);
		}
	}
	 public static void sortASC(int [] arrInput) {
	        int temp = arrInput[0];
	        for (int i = 0 ; i < arrInput.length - 1; i++) {
	            for (int j = i + 1; j < arrInput.length; j++) {
	                if (arrInput[i] > arrInput[j]) {
	                    temp = arrInput[j];
	                    arrInput[j] = arrInput[i];
	                    arrInput[i] = temp;
	                }
	            }
	        }
	    }
	
}
