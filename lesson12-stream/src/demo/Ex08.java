package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import utils.ArrayUtils;
import utils.CollectionUtils;

public class Ex08 {
	public static void main(String[] args) {
		int[] digits = { 1, 2, 3, 2, 1, 4, 6, 2, 1, 4, 6, 7, 0,13,0 };

		int[] evenNumbrs=Arrays.stream(digits).filter(x->x%2==0).distinct().toArray();
		printNbrs(evenNumbrs);
		System.out.println("\n=======================================");
		
		//Convert array -> list
		// ko thể đưa trực tiếp array int[] sang list<Integer> được
		List<Integer> numbers = Arrays.stream(digits)            //IntStream
								.boxed()                         //IntStream -> stream<Integer>
								.collect(Collectors.toList());   //List<Integer>
		
		
		//Tim cac so xuat hien chi mot lan
		/*
		 * frequency chỉ nhận tham số là collection, ko nhận array
		 */
		List<Integer> uniqueNumbers = numbers
				                    .stream()
				                    .filter(nbr -> Collections.frequency(numbers, nbr) == 1)
				                    .collect(Collectors.toList());
		uniqueNumbers.forEach(System.out::println);
		
		
		System.out.println("========================================================");
		
		numbers.stream()
        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))  //Map<Integer, List<Integer>> 
        .entrySet()      							 //Set<Entry<Integer,long>>                      
        .stream()									 //Stream<Entry<Integer,long>>  
        .filter(entry->entry.getValue()==1)          //Entry<Key,value>  with value=1
        .map(Entry::getKey)							//Stream<Integer>
        .collect(Collectors.toList())               //List<Integer>
        .forEach(System.out::println);
		
		
	}
	private static void printNbrs(int []a) {
		for(int i: a) {
			System.out.print(i+" ");
		}
	}
}
