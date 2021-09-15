package ex03;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import utils.FileUtils;

public class Ex03 {
	private static String input = "input.txt";
	private static String output = "output.txt";
	public static void main(String[] args) {
		File file = new File(input);
		List<String> lines = FileUtils.readLines(file);
		Set<Integer> numberSet = handleData(lines);
		FileUtils.writeFile(numberSet,output);
	}
	private static Set<Integer> handleData(List<String> lines){
		Set<Integer> numberSet = new TreeSet<>();
		for(String line: lines) {
			List<Integer> numOfLine = splitLine(line);
			for(int number: numOfLine) {
				numberSet.add(number);
			}
		}
		return numberSet;
	}
	private static List<Integer> splitLine(String line){
		List<Integer> rs = new ArrayList<>();
		line = line.trim();
		String[] numbStrs = line.split("[^0-9]+");
		for( String num: numbStrs) {
			try {
				rs.add(Integer.parseInt(num));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return rs;
	}
	
}
