package test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try{
			testException(-5);
			testException(-10);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			System.out.println("Releasing resources");			
		}
		testException(15);
	}
	
	public static void testException(int i) throws FileNotFoundException, IOException{
		if(i < 0){
			throw new FileNotFoundException("Negative Integer " + i);
		}else if(i > 10){
			throw new IOException("Only supported for index 0 to 10");
		}
	}
}
