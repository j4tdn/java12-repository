package control;

public class Ex01 {
    public static void main(String[] args) {

            int a=4;
            int b=7;
            int c=11;
            System.out.println("Max 2 so la: " +max(a,b));
            System.out.println("Max 3 so la: "+ max(a,b,c));
        }
        private static int max(int a, int b) {
            if(a>b)
                return a;
            return b;
        }
        private static int max (int a, int b,int c)
        {
            int max =a>b?a:b;
            if(max < c)
                max=c;
            return max;
        }
    }




