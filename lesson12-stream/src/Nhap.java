import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Nhap {
	public static boolean writeFile(String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			bw.write(456);
	
			bw.write(321);
			
			bw.write(123);
			bw.write(012);
			bw.write(1);
			bw.write(2);
			bw.write(3);
			bw.write("asdasdasdasd");
			
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean readFile(String path) {
		try {
			FileInputStream fis=new FileInputStream(path);
			InputStreamReader isr=new InputStreamReader(fis, "UTF-8");
			BufferedReader br=new BufferedReader(isr);
			String line=br.readLine();
			
			while(line!=null) {
				line=br.readLine();
				System.out.println(line);
			}
			br.close();
			isr.close();
			fis.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public static void main(String[] args) {
		writeFile("d://file2.txt");
	}
}
