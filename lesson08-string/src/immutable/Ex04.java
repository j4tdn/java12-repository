package immutable;

public class Ex04 {

    public static void main(String[] args) {
        String s = "GridLayout GridManager";
        String[] books = {"1-STK-123","STK234-STK","SGK345"};

        // print text books
//        for(String book : books){
//            if (book.startsWith("STK")){
//                System.out.println(book);
//            }
//        }
        for(String book : books){
            if (book.contains("STK")){
                System.out.println(book);
            }
        }
        System.out.println("------------------");

        for(String book : books){
            if (book.endsWith("STK")){
                System.out.println(book);
            }
        }

        System.out.println("-----------------");

        System.out.println("cau 2.-------------------");

        s = s.replaceFirst("Grid","Flow");
        System.out.println("s: "+s);

        System.out.println("cau 3 -----------------");

        String ss = "  Football  Cooking      Badminton";

        System.out.println(ss);
       // ss = ss.trim(); // cắt khoảng trắng ở cuối và cuối.
//        String[] array = ss.split("\\s+"); // s : space( Khoảng trắng)
//
//        String result = "";
//        for (String a: array) {
//            result += a + " ";
//        }
//        System.out.println("result:"+result.trim());

        System.out.println("--------------- Cách Khác ----------- ");

        String result = ss.trim().replaceAll("\\s+"," ");

        System.out.println("result: "+result);
        System.out.println("Câu 4.------------------");

        String song  = "d:/music/somthingyoulike.mp3";
        int lastSlash = song.lastIndexOf("/");
        int lastDot = song.lastIndexOf(".");

        String songName = song.substring(lastSlash + 1,lastDot);
        System.out.println("songName: "+songName);
    }
}
