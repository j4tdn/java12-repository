//package exception;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Ex05 {
//	public static void main(String[] args) {
//		System.out.println(readFirstLine("database.md"));
//	}
//	public static String readFirstLine(String path) throws IOException{
//		BufferedReader in = new BufferedReader(new FileReader(path)); //FNF exception
//			String line = in.readLine(); // IO exception
//			return line;
//		
//	}
//}
