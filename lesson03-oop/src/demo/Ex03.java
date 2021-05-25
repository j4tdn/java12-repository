package demo;

import bean.Car;

public class Ex03 {
    public static void main(String[] args) {
//        Demo 2 primitive type
        int p1 = 10 ;
        int p2 = 20 ;
        int p3 = 10;
        compare("p1 == p1",p1 == p2);
        compare("p1 == p3",p1 == p3);

        // Demo compare 2 object's address
        String o1 = new String("hello");// heap
        String o2 = "hello";// constant pool
        String o3 = "hello";// constant pool

        hash("o1",o1);
        hash("o2",o2);
        hash("o3",o3);


        compare("o1 == o2",o1==o2);
        compare("o1 == o3",o1==o3);
        compare("o3 == o2",o3==o2);

//        Demo compare content of objects
        System.out.println("o12: "+o1.equals(o2));
        System.out.println("o13: "+o1.equals(o3));
        System.out.println("o23: "+o2.equals(o3));

        Car c1 = new Car(123, "Audi"," Greed");
        Car c2 = new Car(234, "Mazda"," Red");
        Car c3 = new Car(123, "Toyota"," While");
        System.out.println("=================");
        compare("c12",c1.equals(c2));
        compare("c13",c1.equals(c3));
        compare("c23",c2.equals(c3));





    }
//  Operator : ==
//    Compare 2 stack's values
    private static void compare(String text, boolean result){
        System.out.println(text+ ": "+result);
    }

    private static void hash(String text,String input){
        System.out.println(text+" : "+System.identityHashCode(input));
    }
}
