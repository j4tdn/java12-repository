package manipulation;

import java.io.File;
import java.nio.file.StandardOpenOption;
import java.util.List;

import common.Trader;
import utils.DataUtils;
import utils.FileUtils;

public class Ex02 {
	private static final String TRADER_PATH = "trader.txt";
	private static final String TRANSACTION_PATH = "transaction.txt";

	public static void main(String[] args) {
		File traderFile = FileUtils.create(TRADER_PATH);
//		FileUtils.create(TRANSACTION_PATH);

		List<Trader> traders = DataUtils.getTrader();
		
		FileUtils.writeLines(traderFile.toPath(), traders, StandardOpenOption.APPEND);
		
		FileUtils.open(traderFile);
	}
}
