package demo;

import utils.ArrayUtils;
import utils.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex08 {
    public static void main(String[] args) {
        // source: List<E>, E[]
        int[] digits = {1, 2, 1, 7, 3, 3, 2, 4, 3};

        // Stream Object: Stream<T>
        // Stream Primitive: IntStream, DoubleStream, LongStream

        int[] evenNumbers = Arrays.stream(digits)
                .filter(digit -> digit % 2 == 0)
                .distinct()
                .toArray();
        ArrayUtils.printf(evenNumbers);
        /*List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);

        Set<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                // .distinct() // Set, Map, HashTable >> hashCode, equals
                .collect(Collectors.toSet());
        System.out.println("runtime : " + evenNumbers.getClass().getSimpleName());
        CollectionUtils.printf(evenNumbers);*/

        // Stream<T> -> collect(Collectors.toList()) = List<T>
        // IntStream ->              X               = List<int>
        // IntStream -> Stream<Integer> -> collect

        // convert int[] -> List<Integer>
        List<Integer> numbers = Arrays.stream(digits).boxed().collect(Collectors.toList());

        List<Integer> uniqueNumbers = numbers.stream()
                .filter(number -> Collections.frequency(numbers, number) == 1) // Stream<Integer>
                .collect(Collectors.toList());

        CollectionUtils.printf(uniqueNumbers);

        System.out.println("================");

        // Key: Checked Element
        // Value: amount of checked element
        numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet() // Set<Entry<Integer, Long>>
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey) // Stream<Integer>
                .collect(Collectors.toList()) // List<Integer>
                .forEach(System.out::println);

    }
}
