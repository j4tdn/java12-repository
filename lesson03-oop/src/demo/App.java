package demo;

import bean.Box;

public class App {
    public static void main(String[] args) {
//    Initial 2 boxs
//    Box1 w8 h4
//    box2 w6 h3

        int a = 10; // stack
//        initial object from class
        Box box1 = new Box() ;// def null
        box1.setHeight(8);
        box1.setWidth(4);

        System.out.println(System.identityHashCode(box1));


        Box box2 = new Box();
        box2.setWidth(6);
        box2.setHeight(3);

        System.out.println(System.identityHashCode(box2));

        System.out.println(box1);
        System.out.println(box2);

    }
}
