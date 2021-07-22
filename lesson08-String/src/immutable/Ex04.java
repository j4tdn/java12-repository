package immutable;

public class Ex04 {
	/**
	 * 1.Kiểm tra kí tự bắt đầu, kết thúc trong chuỗi s có phải là s1 ko
	 * 2.Thay thế chuỗi s1 trong chuỗi s bằng chuỗi s2 
	 * 3.Loại bỏ khoảng trắng thừa trong chuỗi
	 * 4.Tao chuoi con tu chuoi S, bắt đầu tự vị trí x
	 * 
	 */
	public static void main(String[] args) {
		String s= "GridLayout GridManager";
		String []books= {"SGK123","234-STK","SGK245","STK-222"};
		
		//1.
		for(String book: books) {
			//String.endsWith
			if(book.endsWith("STK")) {
				System.out.println(book);
			}
			//String.startWith
			if(book.startsWith("STK")) {
				System.out.println(book);
			}
		}
		
		//2.
		//replace
		s=s.replace("Grid", "Flow");
		System.out.println(s);
		//replace first
		s=s.replaceFirst("Flow", "Grid");
		System.out.println(s);
		
		//3
		String ss= "    Ana   play      badMinton  ";
		System.out.println(ss.trim().replaceAll("\\s+"," "));
		
		//[,\\s]+   thay thế 1 hoặc nhiều của 1 bộ (gồm dấu "," hoặc space )
		String ss2="    Ana,,,   play,      badMinton  ";
		System.out.println(ss2.trim().replaceAll("[,\\s]+"," "));
		
		//4
		String song  = "d:/music/somthingyoulike.mp3";
		int lastSlash=song.lastIndexOf("/");
		int lastDot=song.lastIndexOf(".");
		
		String songName=song.substring(lastSlash+1,lastDot);
		System.out.println("Songname: "+songName);
		
		
	}
}
