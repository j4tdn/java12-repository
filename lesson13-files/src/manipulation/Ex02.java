package manipulation;

import common.Trader;
import utils.DataUtils;
import utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Ex02 {
    private static final String TRADER_PATH = "trader.txt";
    private static final String TRANSACTION_PATH = "transaction.txt";

    public static void main(String[] args) throws IOException {
        // Write data: Input >> List<T> <==> Output >> Write file successfull
        File traderFile = FileUtils.create(TRADER_PATH);
        List<Trader> traders = DataUtils.getTraders();
        FileUtils.writeLines(traderFile.toPath(), traders, StandardOpenOption.WRITE);

        // Read data: Input >> File >> Lines <==> Output: List<T>
//        Path path = Paths.get(TRADER_PATH);
//        List<Trader> traders = FileUtils.readLines(path, Trader::toObject);
//        System.out.println(traders);
    }
}
