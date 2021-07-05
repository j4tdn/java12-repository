package immutable;

public class Ex04 {

	public static void main(String[] args) {
		String s = "GridLayout GridManager";
		String[] books = {"1-STK-23","STK234","SGK345"};
		
		//Print text books
		for(String book: books) {
			if(book.contains("STK")) {
				System.out.println(book);
			}
		}
		
		s = s.replaceFirst("Grid","Flow" );
		System.out.println("s: "+s);
		
		String ss = "  Football   Cooking  Badminton";
		 //s : space+
		String result = ss.trim().replaceAll("\\s+", " ");
		System.out.println("result: "+result);

		String song  = "d:/music/somthingyoulike.mp3";
		int lastSlash = song.lastIndexOf("/");
		int lastDot = song.lastIndexOf(".");
		
		String songName = song.substring(lastSlash+1,lastDot);
		System.out.println("songName: "+songName);
	}
	
}
