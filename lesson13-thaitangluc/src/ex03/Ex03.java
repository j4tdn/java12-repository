package ex03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import utils.FileUtils;

public class Ex03 {
	private static final String INPUT = "input.txt";
	private static final String OUTPUT = "output.txt";
	public static void main(String[] args) {
		
		File input = FileUtils.create(INPUT);	
		File output = FileUtils.create(OUTPUT);	
		List<String> list = readFile(input);
		int n = Integer.parseInt(list.get(0));
		System.out.println("n = " + n);
		list.remove(0);
		list = splitNumber(list);
		writeFile(output, list);
	}
	
	@SuppressWarnings("null")
	private static List<String> splitNumber(List<String> list){
		List<Integer> result = new ArrayList<>();
		for (String str: list) {
			String[] strNum = str.split("[a-zA-Z]+");
			for (String s: strNum) {
				if (!s.isBlank()) {
					result.add(Integer.parseInt(s));
				}
			}
		}
		return result.stream()
					 .sorted()
					 .map(String::valueOf)
					 .collect(Collectors.toList());
	}
	
	private static List<String> readFile(File file){
		List<String> lists = null;
		try {
			lists = Files.readAllLines(file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lists;
	}
	
	private static void writeFile(File file, List<String> list) {
		
		try {
			Files.write(file.toPath(), list, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Write successful");
	}
}
