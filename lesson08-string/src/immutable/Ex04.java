package immutable;

public class Ex04 {
	/**
	 * 
	 */
	public static void main(String[] args) {
		String s = "GridLayout GridManager";
		String[] books = {s, "1-SGK-23", "234-STK", "SGK345"};
		
		// Print text books
		for(String book : books) {
			if (book.contains("SGK")) {
				System.out.println(book);
			}
		}
		
		s= s.replaceFirst("Grid", "Flow");
		System.out.println("s: " + s);
		
		String ss = "    Football     Cooking       Badminton";
		ss = ss.trim().replaceAll("\\s+", " ");
		System.out.println("ss: " + ss);
		
		String song  = "d:/music/somthingyoulike.mp3";
		int lashSlash = song.lastIndexOf("/");
		int lastDot = song.lastIndexOf(".");
		
		String songName = song.substring(lashSlash + 1, lastDot);
		System.out.println("songName: " + songName);
		
		byte a = 65;
		System.out.println("a: " + (char)a);
		
		char[] chars = s.toCharArray();
	}
}
