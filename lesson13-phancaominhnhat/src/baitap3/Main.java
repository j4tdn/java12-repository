package baitap3;

public class Main {
	private static String PATH_INPUT = "src/baitap3/input.txt";
	private static String PATH_OUTPUT = "src/baitap3/output.txt";
	private static String[] inputText = {"4", "43si56los0", "z567it34a002", "le2si1234m", "231333"};
	
	public static void main(String[] args) {
		Utils.createFileInput(PATH_INPUT, inputText);
		Utils.readAndWriteFile(PATH_INPUT, PATH_OUTPUT);
	}
}
