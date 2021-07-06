package exception.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
	private static final String PATH = "database.md";

	public static void main(String[] args) {
		File file = new File(PATH);
		if (file.exists()) {
//			FileWriter fw = null;
			try(FileWriter fw = new FileWriter(file); /* IOException */) {
				
				fw.write("Line 1\n");
				fw.write("Line 2\n");
				fw.write("Line 3\n");
				fw.write(".............\n");
				fw.write(9 / 0); /* ArithmeticException */
				fw.write("Line 10");

			} catch (IOException | ArithmeticException e) {
				e.printStackTrace();
			} /*
				 * finally { System.out.println("Complete writting data into file " +
				 * file.getName());
				 * 
				 * // save and close file try { fw.close(); } catch (IOException e) {
				 * e.printStackTrace(); } }
				 */
			System.out.println("Main end!");
		}
	}
}
