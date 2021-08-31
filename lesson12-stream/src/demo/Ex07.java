package demo;

import bean.Dish;
import bean.Dish.Kind;
import utils.DishUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Ex07 {
    public static void main(String[] args) {
        // Stream is "sequences of elements from SOURCE that helps manipulate collections of data"
        // Source: menu
        List<Dish> menu = DishUtils.getAll();

        // menu-source -> stream -> intermediate operation -> stream -> terminal operation -> non-stream type (long, collection, array)
        List<String> meatDishes = menu.stream()
                .filter(dish -> Kind.MEAT.equals(dish.getKind()))
                .map(Dish::getName)
                .collect(Collectors.toList());
        meatDishes.forEach(System.out::println);

        // What is Stream ?
        // Stream is "sequences of elements from SOURCE that helps manipulate collections of data"
        // Stream: SOURCE - [INTERMEDIATE OPERATIONS - TERMINAL OPERATIONS] - TARGET

        // INTERMEDIATE OPERATIONS >> returned type: Stream<T>
        // TERMINAL OPERATIONS     >> returned type: Non-Stream
        //                         >> count, collect, forEach, toArray

        // Steps: menu-source -> stream -> intermediate operation -> stream -> terminal operation -> non-stream type (long, collection, array)
        // Features:
        // 1. Traversable once only
        // 2. Stream & Collections
        // Same: Can store and manipulate with data
        // Diff: Collection: Focus on store data
        //       Stream    : Focus on manipulate data
        // 3. Intermediate operations will do nothing until a terminal operation invoke
        // 4. Internal iteration
        // 5. Express a query than ad hoc implementation

    }
}
