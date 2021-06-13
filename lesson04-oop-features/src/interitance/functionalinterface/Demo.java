package interitance.functionalinterface;

public class Demo {
    public static void main(String[] args) {

        System.out.println("sum : "+calculate(10,20,(a , b)  -> a + b));
    }

    private static int calculate(int a, int b , Manipulation mal){
        return mal.perform(a,b);
    }
}
