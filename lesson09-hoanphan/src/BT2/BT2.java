package BT2;

import java.util.Arrays;

public class BT2 {
	  static void sortString(String str) {
	        char []arr = str.toCharArray();
	        Arrays.sort(arr);
	        System.out.println(String.valueOf(arr));
	    }
		public static void main(String[] args) {
			String str = "01a2b3456cde478";
			sortString(str);	
			str = str.replaceAll("\\D+","");
			System.out.println(str);
		}
}
