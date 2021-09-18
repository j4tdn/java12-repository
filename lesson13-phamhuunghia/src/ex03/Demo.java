package ex03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Demo {
	private static final String  input = "input.txt";
	private static final String  output = "output.txt";
	
	public static void main(String[] args) {
		createFile(input, new String[] {"4", "43silos0", "zita002", "le2sim", "231233"});
		
		getResult();
		
		
	
	}
	private static void getResult() {
		List<String> lines = null;
		List<Integer> digits=new ArrayList<Integer>();
		
		try {
			lines = Files.readAllLines(Paths.get("input.txt"));
			String line = lines.get(0);
			
			if (!line.matches("[0-9]+") ||   Integer.parseInt(line) < 1 && Integer.parseInt(line) > 100) {
				return;
			}
			
			for(String li : lines) {
				asignVal(li, digits);
			}
			
			digits.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o1 - o2 ;
				}
			});
			
			FileWriter fw = new FileWriter("output.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			for (Integer num : digits) {
				pw.write(num.toString() + "\n");
				System.out.print(num.toString() + "\n");
			}
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void asignVal(String line, List<Integer> nums) {
		int count = 1;
		String[] temps=line.replaceAll("\\D+", "-").split("-"); 
		for(String nbrString:temps) {
			if(nbrString != "" && count<=500) {						
				int number = Integer.parseInt(nbrString);
				nums.add(number);
				count++;
			}
		}
	}
	
	
	private static void createFile(String name, String []data ) {
		File input = new File(name);
		if(!input.exists()) {			
			try {
				input.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(input);
			bw = new BufferedWriter(fw);
			int count = 1;
			for(String line : data) {
				bw.write(line);
				if(count < data.length) {
					bw.newLine();
					count++;
				}	
			}
			bw.close(); 
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
