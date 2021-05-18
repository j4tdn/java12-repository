package data;

public class Ex09 {
    public static void main(String[] args) {
        //final cannot update value in stack
        final int a = 10;
        final int b = 20;
        final Integer c = 30;
        final Digit d = new Digit(20);
        System.out.println(" Value: "+d.value);
    }
}
