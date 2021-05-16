package data_structures;
import java.util.Arrays;

import java.util.Scanner;


public class Ex04 {
	
	public int odd(int[] array)
	{	
        int max = array[0];

		for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > max) {
                max = array[i];
                System.out.println("Max "+max);
            }
        }
        return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the length of the array:");
	    int length = sc.nextInt();
	    int[] array = new int[length];
	    System.out.println("Enter the elements of the array: ");
	    for(int i=0; i<length; i++ ) {
	    	
	         array[i] = sc.nextInt();
	         
	      }
	    System.out.println("arrays is: "+Arrays.toString(array));
	    Ex04 ob = new Ex04();
	    ob.odd(array);
	    sc.close();
	}

}
