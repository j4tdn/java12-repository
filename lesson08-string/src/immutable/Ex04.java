package immutable;

public class Ex04 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
             String s="GridLayout Manager";
             String[] books= {"SGK123","STK234","SGK345","234-STK"};
             
             //Print Text Books
             for(String book: books) {
            	 if(book.startsWith("SGK")) {
            		 System.out.println(book);
            	 }
             }
             for(String book: books) {
            	 if(book.endsWith("STK")) {
            		 System.out.println(book);
            	 }
             }
             for(String book: books) {
            	 if(book.contains("STK")) {
            		 System.out.println(book);
            	 }
             }
            
             s= s.replace("Grid","Flow");
             System.out.println("s: "+s);
             
             String ss="   FootBall   Cooking     Badminton    ";         
//             ss=ss.trim();
            System.out.println(ss);
            
            String result=ss.trim().replaceAll("\\s+"," ");
            System.out.println("result: "+result);
            
            String song  = "d:/music/somthingyoulike.mp3";
            int lastSlash=song.lastIndexOf("/");
            int lastDot=song.lastIndexOf(".");
            String songName=song.substring(lastSlash+1,lastDot);
            System.out.println("songName: "+songName);
             
             
	}
}
