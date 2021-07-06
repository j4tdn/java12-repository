package immutate;

public class Ex04 {
	/**
	 1. Kiểm tra ký tự bắt đầu, kết thúc trong chuối s có phải là s1 không
	 2. Thay thế chuỗi s1 bằng chuỗi s2 trong s
	 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
	 4. Tạo chuỗi con s2 từ chuỗi s bắt đầu từ vị trí số 6
	 */
	public static void main(String[] args) {
		String s= "GridLayout Manager";
		String[] books = {"SGK123","STK234","SGK345"};
		
		//print textbooks
		for(String book:books) {
			if(book.startsWith("SGK")) {
				System.out.println(book);
			}
		}
		
		s= s.replace("Grid", "Flow");
		System.out.println("s: " +s);
		
		String ss = "    Football     Cooking Badminton   ";
//		String[] array=ss.split("\\s+");
//	
//		String result="";
//		for( String a:array) {
//			result+=a + " ";
//		}
//		System.out.println("result: "+ result.trim());
		
		ss=ss.trim().replaceAll("\\s+", " ");
		System.out.println("ss: " + ss);
		
		String song  = "d:/music/somethingyoulike.mp3";
		int lastSlash = song.lastIndexOf("/");
		int lastDot = song.lastIndexOf(".");
		
		String songName = song.substring(lastSlash+1,lastDot);
		System.out.println("songName: " +songName);
		
		byte a=65;
		System.out.println("a: " + (char)a);
		
		//char[] chars = s.toCharArray();
	}

}
