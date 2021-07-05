package immutable;

public class Ex06 {
    public static void main(String[] args) {
        //Print : 192-555-888-999
        String[] ids = {"192", "555", "888", "999"};
        for (int i = 0; i < ids.length; i++){
            System.out.print(ids[i]);
            if (i != (ids.length - 1)){
                System.out.print("-");
            }
//        System.out.println(String.join("-", ids));
//
//        String a = "";
//        String b = "";
//
//        printf("111", "222", "33");
    }

    // ... variables
//    private static void printf(String ... ids) {
//        for (String id : ids) {
//            System.out.println(id);
//        }
    }
}


