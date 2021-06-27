package ex01;

import java.util.Arrays;

public class Ex01 {
    /*
     * 	Cho mảng A gồm n phần tử (2 < n < 20). Ak = [0, 100]
        Viết hàm liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong mảng.
        Kết quả trả về được sắp xếp tăng dần.

         Input: 3, 15, 21, 0, 15, 17, 21
         Output: 0, 3, 17
     */

        public static void main(String[] args) {
            int[] digits = { 3, 19, 21, 0, 15, 17, 21};
            int[] uniqueArray = getUniqueElements(digits);


            printf(digits);
            System.out.println("\n===========");
            sort(uniqueArray);
            printf(uniqueArray);

        }

        private static int[] getUniqueElements(int[] elements) {
            // fixed-length
            int[] result = new int[elements.length];
            boolean[] isDupFlags = new boolean[elements.length];
            // iterate an array with 2 ways
            //for index F F F F F F F
            // for each 1 2 4 1 3 2 1
            for (int out = 0; out < elements.length; out++) {
                for(int in = 0;in < elements.length; in++) {
                    if(!isDupFlags[out] ) // kiem tra xem no flase , neu true khong kiem tra.
                    {
                        if(out != in && elements[out] == elements[in]) {
                            isDupFlags[out] = true;
                            isDupFlags[in]  = true;
                        }
                    }
                }
            }
            // iterate an array with 2 ways
            //for index T T F F T F T T :flags
            // for each 1 2 4 O 1 3 2 1 :elements

            // result   0 0 4 O 0 3 0 0
            //          4 O 3 0 0 0 0 0

            int count = 0;
            for (int i = 0; i < elements.length; i ++) {
                if(!isDupFlags[i]) {
                    result[count ] = elements[i];
                    count++; // count = 3
                }
            }

//		int[] finalResult = new int[count];
//
//		for (int i = 0; i < finalResult.length; i++) {
//			finalResult[i] = result[i];
//
//		}

//		int[] finalResult = Arrays.copyOfRange(result, 0, count);


            return Arrays.copyOfRange(result, 0, count);
        }
        //	sap xep
        private static void sort(int[] elements) {
            //         0 19 17  15 3
            // loop 1:             19
            // loop 2:			17 19
            // loop 3:		15  17 19
            // bubble sort : sắp xếp nổi bọt
            // after a loop => a bubble element will be selected

            for(int out = elements.length - 1;out > 0 ;out --) {
                for(int in = 0; in < out ; in ++) {
                    if(elements[in] > elements[out]) {
                        // swap
                        int tmp = elements[in];
                        elements[in] = elements[out];
                        elements[out] = tmp;
                    }
                }
            }
        }

        private static void printf(int[] elements) {
            for(int element : elements) {
                System.out.print(element+ "  ");
            }
        }



    }

