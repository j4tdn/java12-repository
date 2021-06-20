package exception.compile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Ex02 {
	private static final String Path = "database.md";
	public static void main(String[] args) {
		File file=new File(Path);
		FileWriter fw = null;
		if(file.exists()) {
			try {
				fw = new FileWriter(file);
				fw.write("Line 1\n");
				fw.write("Line 2\n");
				fw.write("Line 3\n");
				fw.write("Line 4\n");
				fw.write("Line 5\n");
				fw.write("Line 770\n");
				fw.write("=================================");
				
				fw.write(5/0);
				
				fw.write("Line 333\n");
				fw.write("Line 334\n");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (ArithmeticException e) {
				e.printStackTrace();
			}
//			//catch (ArithmeticException || IOException e) {
//			e.printStackTrace();
//			}
			finally {
				System.out.println("complete write data into file "+file.getName());
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
