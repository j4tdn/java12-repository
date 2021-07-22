package sort;

import utils.ArraysUtils;

public class Ex04 {
    public static void main(String[] args) {
        // selection sort

        int[] digits = {1, 5 , 9 ,4 , 6, 11};
        for(int i=digits.length-1;i>0;i--) {
            int maxIdx =-1;
            int max = Integer.MIN_VALUE;
            for( int j=0;j<i;j++) {
                if(digits[j]>max) {
                    max = digits[j];
                    maxIdx=j;
                }
            }

            if(digits[maxIdx]>digits[i]) {
                //swap element maxid và i
                int tmp = digits[i];
                digits[i]= digits[maxIdx];
                digits[maxIdx] = tmp;
            }
        }
        ArraysUtils.printf(digits);

    }
}
