package immutable;

public class Ex04 {

	public static void main(String[] args) {
		String s = "GridLayout Manager";
		String[] books = { "SGK123", "STK234", "SGK345" };

		// Print text books
		// startsWith - endsWith - contains
		for (String book : books) {
			if (book.startsWith("STK")) {
				System.out.println(book);
			}
		}

		s = s.replace("Grid", "Flow");
		System.out.println("s: " + s);
		String ss = "    Football      Cooking     Badminton";
		String result = ss.trim().replaceAll("\\s+", " ");
		System.out.println("result: " + result);
		
		String song = "d:/music/somthingyoulike.mp3";
		int lastSlash = song.lastIndexOf("/");
		int lastDot = song.lastIndexOf(".");

		// substring(int beginIndex, int endIndex) includes beginIndex, excludes
		// endIndex
		String songName = song.substring(lastSlash + 1, lastDot);
		System.out.println("songName: " + songName);

		byte a = 65;
		System.out.println("a: " + (char)a);
	}
}
