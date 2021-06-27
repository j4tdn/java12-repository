package ex02;
import java.util.Arrays;

public class Ex02 {
    /*
     * 	Cho mảng A gồm n-1 phần tử với Ak = [1, n].
        Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.

         VD1: n = 6, Ak = [3, 2, 1, 6, 5]
         Phần tử cần tìm có giá trị: 4

         VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
         Phần tử cần tìm có giá trị: 8
     */
    public static void main(String[] args) {

        int[] digits = {3, 2, 1, 6 ,5};

        int number =  getMissingNumber(digits);
        System.out.println("Missed number: "+number);

    }



    private static int getMissingNumber(int[] digits) {
        // 1,n = n*(n+1)/2
        int max= digits.length + 1;//6
//		int initialSum = (max * (max + 1))/2; // 21
//		int sum = sum(digits); // 17

        return  (max * (max + 1))/2 - sum(digits)  ;



    }

    private static int sum(int[] digits ) {

        return Arrays.stream(digits).reduce(0,Integer::sum);
//		int result = 0;
//		for(int digit : digits) {
//			result += digit;
//		}
//		return result;
    }



}

