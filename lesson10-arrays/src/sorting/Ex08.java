package sorting;

import java.util.Arrays;
import static java.util.Comparator.*;
import static java.util.function.Function.*;


import utils.ArrayUtils;

public class Ex08 {

	public static void main(String[] args) {
		String[] sequences = {"A",null,"b","D","a","B"};

		//anonymous class
		//anonymous function = lamda expression
//		Comparator<String> comparator = (s1,s2)-> s2.compareTo(s1);
		 

		Arrays.sort(sequences, nullsLast(comparing(identity(),reverseOrder())));
		ArrayUtils.printf(sequences);
		
	}
}
