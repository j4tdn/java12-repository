package immutable;

public class Ex04 {
	/**
	  1. Kiểm tra kí tự bắt đầu, kết thúc trong chuỗi s có phải là s1 không.
	  2. Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
	  3. Loại bỏ các khoảng trắng thừa của chuỗi s3
	  4. Tạo chuỗi con từ chuỗi s bắt đầu từ vị trí số 6
	 */
	public static void main(String[] args) {
		String s = "GridLayout GridManager";
		String[] books = {"1-STK-23", "234-STK", "SGK345"};
		
		// Print text books
		for (String book: books) {
			if (book.contains("STK")) {
				System.out.println(book);
			}
		}
		
		s = s.replaceFirst("Grid", "Flow");
		System.out.println("s: " + s);
		
		String ss = "  Football     Cooking     Badminton   ";
		String result = ss.trim().replaceAll("\\s+", " ");
		System.out.println("result: " + result);
		
		String song = "d:/music/somthingyoulike.mp3";
		int lastSlash = song.lastIndexOf("/");
		int lastDot = song.lastIndexOf(".");
		
		String songName = song.substring(lastSlash+1, lastDot);
		System.out.println("songName: " + songName);
		
		byte a = 65;
		System.out.println("a: " + (char)a);
		
	}
}
