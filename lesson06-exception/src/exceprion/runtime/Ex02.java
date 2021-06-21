package exceprion.runtime;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
	private static final String PATH="database.md";
	public static void main(String[] args) {
		//write data into file
		
		//access file
		File file = new File(PATH);
		if(file.exists()) {
			//write data into file
			FileWriter fw =null;
			try {
				fw = new FileWriter(file);
				fw.write("Line 1\n");
				fw.write("Line 2\n");
				fw.write("Line 3\n");
				fw.write("Line 4\n");
				
				//calculation =>exception
				fw.write(5/0);
				
				fw.write("Line k\n");
				
				//unreadable catch
				//catch(Exception e)
				
				//readable catch
			} catch (IOException | ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println("Complete data into file " +file.getName());
				
				try {
					//save and close
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("----Thread main-----");
		}
	}
}
