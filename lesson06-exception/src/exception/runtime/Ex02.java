package exception.runtime;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
	private static final String PATH="database.md";

	public static void main(String[] args) {
       File file =new File(PATH);	
       FileWriter fw = null;
	try {
		fw = new FileWriter(file);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
       if(file.exists()) {
    	   //Write data into files !
    	   try {
		
			fw.write("Line 1/n");
			fw.write("Line 2/n");
			fw.write("Line 3/n");
			fw.write("Line 4/n");
			fw.write("Line 5/n");
			fw.write(5/0);
			fw.write("Line 99/n");
			System.out.println("Write data info file sucessful..");
			
			//save and close
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Complete writing data into file "+file.getName());
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
