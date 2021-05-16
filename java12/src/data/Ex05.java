package data;

public class Ex05 {
    public static void main(String[] args) {
        Integer a = 20;
        Integer b = 200;

        swap(a,b);

        System.out.println("f :"+ a );
        System.out.println("S : "+ b);

    }
    //100% toan tu bang "=" hoat dong o stack
    private static void swap(Integer first, Integer second) {
        Integer tmp = first;
        first = second;
        second = tmp;
    }

}

