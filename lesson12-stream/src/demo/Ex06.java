package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import bean.Trader;
import utils.FileUtils;

public class Ex06 {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("D:\\JAVA-12\\workspace-minhnhat\\lesson12-stream\\src\\trader.txt");
		lines.forEach(System.out::println);
		System.out.println("======================");		
		
//		List<Trader> traders = new ArrayList<>();
		// line >> name-city
//		for (String line: lines) {
//			String[] tokens = line.split("-");
//			if(tokens.length == 2) {
//				Trader trader = new Trader(tokens[0], tokens[1]);
//				traders.add(trader);
//			}
//		}
		List<Trader> traders = convert(lines, Trader::transfer);
		traders.forEach(System.out::println);
//		traders.forEach(new Consumer<Trader>() {
//			@Override
//			public void accept(Trader t) {
//				System.out.println(t);
//				
//			}
//		});
	}
	
	private static <T> List<T> convert(List<String> lines, Function<String, T> function){
		List<T> result = new ArrayList<>();
		for(String line: lines) {
			T t = function.apply(line);
			if(t != null) {
				result.add(t);
			}
		}
		return result;
	}
}
