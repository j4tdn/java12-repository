package manipulation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import common.Trader;
import common.Transaction;
import utils.DataUtils;
import utils.FileUtils;

public class Ex02 {
	private static final String TRADER_PATH = "trader.txt";
	private static final String TRANSACTION_PATH = "transaction.txt";
	
	public static void main(String[] args) throws IOException {
		// Write data: Input >> List<T> <=> output >> Write file successful
//		File transactionFile = FileUtils.create(TRANSACTION_PATH);
//		
//		List<Transaction> transactions = DataUtils.geTransactions();
//		FileUtils.writeLines(transactionFile.toPath(), transactions, StandardOpenOption.APPEND);
//		
//		FileUtils.open(transactionFile);
		
		// Read data: Input >> File >> Lines <===> List<T>
		Path path = Paths.get(TRADER_PATH);
		List<Trader> traders = FileUtils.readLines(path, Trader::new);
		System.out.println(traders);
	}
}
