package demo;

import bean.Apple;
import utils.AppleUtils;
import utils.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class Ex04 {
    public static void main(String[] args) {
        List<Apple> inventory = AppleUtils.getAll();

        //instance  -> classA.(classB).method(instance)
        //ClassA.(ClassB) :: method

        Consumer<Apple> c1 = a-> System.out.println(a);
        Consumer<Apple> c2 = System.out::println;
        inventory.forEach(System.out::println);

        //Example 02:
        //ClassA instance -> instance.classA#method of A
        //ClassA::method

        //(String s) - > s.length
        //String::length
        System.out.println("===========Map Length============");
        List<String> texts = Arrays.asList("abc","abcde","ab","abcdef");
        Set<Integer> lengths = CollectionUtils.map(texts, String::length);
        CollectionUtils.printf(lengths);

        System.out.println("===========Map Color============");
        Set<String> colors = CollectionUtils.map(inventory, Apple::getColor);
        CollectionUtils.printf(colors);

        //Example 03:
        Function<String, Integer> f1 = Integer::parseInt;
    }
    }
