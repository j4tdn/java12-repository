package baitap2;
import static baitap2.Utils.*;


public class Main {
	private static String PATH = "images";
	
	public static void main(String[] args) {
		createFolder(PATH);
		
		renameFile(PATH);
	}
}
