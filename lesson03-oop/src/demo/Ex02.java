package demo;

import bean.Box;

public class Ex02 {
    public static void main(String[] args) {
//        how many objects will be created following
//        khi khai bao kieu doi tuong thi duoc luu tru tren head
        int a = 10;
        Integer b = 20;
        Integer c = new Integer(30);
        Integer d = b;

        String e = "text";
        String f = e ;
        String g = new String("value");

        Box box1 = new Box();


// Initial object => Via "new" Keyword : Mandatory
//        Available class (JAVA class)
//        Integer , String ,Double
        Integer a1 = 10;
        Integer a2 = 20;
        Integer b1 = new Integer(20);
    }
}
