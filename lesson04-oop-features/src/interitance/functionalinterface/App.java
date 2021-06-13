package interitance.functionalinterface;

public class App {
    public static void main(String[] args) {

        /**
         * đếm số lượng các số.
         * số chẵn
         * số lẻ
         * chia hết cho 5
         * chia hết cho 3
         */

        int[] digits = {1, 4, 8, 12, 25, 60};

//        System.out.println("event " +countNoEvenNbrs(digits));
//        System.out.println("event " +countNoOddNbrs(digits));
//        System.out.println("event " +countNoDivisionOf3(digits));

//        khởi tạo đối tượng , thể hiện cho interface dùng:
//      implementation class
        Predicate evenCon = new EvenPredicate() ;
            Predicate oddEven = new OddPredicate() ;

                //        anonymous class
                Predicate d3Con = new Predicate() {
                    @Override
                    public boolean stratery(int num) {
                        return num % 3 == 0;
                    }
                };

//      lambda expression (parameters) -> {body}
//        anonymous function
//        khoi tao doi tuong cho Functional Interface
        Predicate d5Con = (int num) ->{
            return num % 5 == 0;
        };

        System.out.println("count even: " + count(digits, num -> num % 2 == 0));
        System.out.println("count odd: "  + count(digits, num -> num % 2 !=0));
        System.out.println("count de: "   + count(digits, num -> num % 3 == 0));
        System.out.println("count de: "   + count(digits, num -> num % 5 == 0));
    }


            private static int count(int[] digits, Predicate con) {
                int count = 0;
                for (int digit : digits) {
                    if (con.stratery(digit)) {
                        count++;
                    }
                }
                return count;
            }

//    private static int countNoDivisionOf3(int[] digits) {
//        int count = 0;
//        for ( int digit: digits) {
//            if (digit % 2 == 0)
//                count ++;
//        }
//        return count;
//    }
//
//    private static int  countNoOddNbrs(int[] digits) {
//        int count = 0;
//        for ( int digit: digits) {
//            if (digit % 2 != 0)
//                count ++;
//        }
//        return count;
//    }
//
////    condition : boolean tenham(int digits)
//
//    private static int countNoEvenNbrs(int[] digits){
//        int count = 0;
//        for ( int digit: digits) {
//            if (digit % 3 == 0)
//                count ++;
//        }
//        return count;
//    }


}
