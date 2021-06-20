package exception.runtime;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex02 {
	private static final String PATH = "database";
	public static void main(String[] args) {
		//access file
		File file = new File(PATH);
		if(file.exists()) {
			//write data into file
			FileWriter fw = null;
			try {
				fw = new FileWriter(file);
				//e.g: 1000 orders
				fw.write("Line 1\n");
				fw.write("Line 2\n");
				fw.write("Line 3\n");
				fw.write("Line 4\n");
				fw.write("Line 5\n");
				fw.write("Line ===================");
				fw.write("Line 770\n");
				
				//calculation -> exception
				//lost power
				fw.write(5/0);
				//TH1:calculate and write file from scratch
				//TH2: ^^ keep data before encounter error
				
				fw.write("Line 999\n");
				fw.write("Line 1000\n");
			
			//Unreadable code catch(Exception e)
			//Readable code
			} catch (ArithmeticException | IOException e) {
//				e.printStackTrace();
				System.out.println("ArithmeticException");
			}finally {
				//save and close
				System.out.println("Complete writing into file "+ file.getName());
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("-----Thread main----------");
		}
	}
}