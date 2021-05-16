package readInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInt {
	static public int nhapSo()throws IOException{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		String s=br.readLine();
		return Integer.parseInt(s);
	}
}
