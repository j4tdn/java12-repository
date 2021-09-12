package manipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import common.Trader;
import utils.FileUtils;

public class Ex02 {
	static final String TRADER_PATH = "trader.txt";
	static final String TRANSACTION_PATH = "trader.txt";

	public static void main(String[] args) throws IOException {
//		//Write data: input >> List<T>  <==> Output >> write file successful
//		File traderFile = FileUtils.create(TRADER_PATH);
//		//File transactionFile = FileUtils.create(TRANSACTION_PATH);
//		List<Trader> traders = DataUtils.getTraders();
//		FileUtils.writeLines(traderFile.toPath(), traders, StandardOpenOption.APPEND);
//		FileUtils.open(traderFile);
		
		//read data: Input >> File >> Lines <==>Output:List<T>
		Path path=Paths.get(TRADER_PATH);
		
		List<Trader> traders=FileUtils.readLines(path,Trader::new);
		System.out.println(traders);
	}
}
