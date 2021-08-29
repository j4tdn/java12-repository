package demo;

import functional.Calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex12
{
    public static void main(String[] args) {

//         Operations: add , subtract, multiply , divide , max , min, average
        // Auto Boxing, Auto Unboxing

//        int a = 5 ;
//        Integer b = a; boxing
//        int c = b; unboxing,
        List<Integer> digits = Arrays.asList(1,2,7,4,5,6);

        // traditional way
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (Integer digit : digits) {
            sum += digit;
            if (max < digit){
                max = digit;
            }
        }

        System.out.println("sum: "+sum);
        System.out.println("max: "+max);
        System.out.println("==============================");

//         stream way>> reduce
        int total = reduce( 0, digits, (a, b) -> (a + b));
        int maximum = reduce( Integer.MIN_VALUE, digits, (a, b) -> a + b);
        int minimum = reduce( Integer.MAX_VALUE, digits, (a, b) -> a + b);

        System.out.println("total: "+total);
        System.out.println("maximum: "+maximum);
        System.out.println("minimum: "+minimum);
        System.out.println("===================");

        int totalAll = digits.stream().reduce(0,Integer::sum);
        int maximumAll= digits.stream().reduce(Integer.MIN_VALUE,Integer::max);
        int  minimumAll= digits.stream().reduce(Integer.MAX_VALUE,Integer::min);

        System.out.println("totalAll "+totalAll);
        System.out.println("maximumAll "+maximumAll);
        System.out.println("minimumAll "+minimumAll);
        System.out.println("===============");
        Optional<Integer> opInt = digits.stream().reduce(Integer::max);
        opInt.ifPresent(value -> System.out.println("max :"+value ));

        if (opInt.isPresent()){
            System.out.println("max: "+opInt.get());
        }

    }

    private static int sum(int a, int b){
        return a + b;
    }
    private static Integer reduce(Integer init, List<Integer> digits , Calculator c){
        int result = 0;
        for (Integer digit : digits) {
            // sum >> result = result + digits
            // max >> result = digit > result ? digit : result
            result =c.perform(result,digit);

        }

        return result;
    }
}
