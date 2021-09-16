package baitap3;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
	public static void createFileInput(String path, String[] inputText) {
		File input = new File(path);
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
			
			for(String line : inputText) {
				bw.write(line); bw.newLine();
			}
			
			bw.close(); fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readAndWriteFile(String pathInput, String pathOutput) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(new File(pathInput));
			br = new BufferedReader(fr);
			
			String dataLine = "";
			boolean isFirstLine = true;
			List<Integer> array = new ArrayList<>();
			while((dataLine = br.readLine()) != null) {
				if(isFirstLine) {
					isFirstLine = false;
					continue;
				}
				for(String numberStr: dataLine.replaceAll("\\D", " ").split(" ")) {
					if(numberStr != "") {						
						int number = Integer.parseInt(numberStr);
						array.add(number);
					}
				}
			}
			
			Collections.sort(array);
			writeFileOutput(array, pathOutput);
			br.close(); fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFileOutput(List<Integer> array, String path) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(new File(path));
			bw = new BufferedWriter(fw);
			
			for(Integer number: array) {
				bw.write(number.toString());
				bw.newLine();
			}
			bw.close();fw.close();
			open(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void open(File file) {
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
