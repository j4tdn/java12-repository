package ex02;

public class Funtion {
	static int getMissingNumber(int[] dataInput) {
		int result = 0;
		sortASC(dataInput);
		for(int i=0;i<dataInput.length-1;i++) {
			if(dataInput[i]+1 != dataInput[i+1]) {
				result = dataInput[i]+1;
			}
		}
		return result;
	}
	 private static void sortASC(int [] arrInput) {
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
