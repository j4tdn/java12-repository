package sorting;

import java.util.Arrays;
import static java.util.Comparator.*;
import static java.util.function.Function.*;
import utils.ArraysUtils;

public class Ex08 {
		public static void main(String[] args) {
			
			String[] sequences = {"A",null,"b","D",null,"a","B"};



			Arrays.sort(sequences, nullsLast(comparing(identity(),reverseOrder())));
			ArraysUtils.printf(sequences);
		}
}
