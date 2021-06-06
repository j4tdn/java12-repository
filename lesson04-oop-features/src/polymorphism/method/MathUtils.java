package polymorphism.method;

public class MathUtils {
    private  MathUtils(){

    }
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b, float c){
        return a + b + c;
    }

    @Override
    public String toString() {
        return "MathUtils "+toString();
    }
}
