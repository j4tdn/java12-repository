package manipulation;

import common.Trader;
import utils.FileUtils;

import java.io.File;
import java.util.List;

public class Ex03 {
    private static final String TRADER_PATH = "trader.txt";

    public static void main(String[] args) {
        File file = new File(TRADER_PATH);

//        List<Trader> traders = DataUtils.getTraders();
//        FileUtils.writeObject(file, traders);

        System.out.println("==========================");

        List<Trader> traders = FileUtils.readObject(file);
        System.out.println(traders);
    }
}
