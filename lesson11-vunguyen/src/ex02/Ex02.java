package ex02;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        CD cd01 = new CD(1,"Bai 1", "A", "anh A", 15, 15.6d);
        CD cd02 = new CD(1, "Bai 2","B", "anh B", 3, 18.9d);
        CD cd03 = new CD(1,"Bai 3", "C", "anh C", 5, 22.3d);
        CD cd04 = new CD(1, "Bai4", "D", "anh D", 2, 33.5d);

        List<CD> CDs = new ArrayList<>(Arrays.asList(cd01, cd02, cd03, cd04));

        int selection = 0;
        do {
            selection = CDUtils.menu();
            switch (selection) {
                case 1:
                    CD cd05 = new CD(1, "Bai5", "E", "anh E", 11, 75.2d);
                    CDUtils.add(cd05, CDs);
                    break;
                case 2:
                    CDUtils.showNumbersOfCDs(CDs);
                    break;
                case 3:
                    CDUtils.showTotalPrice(CDs);
                    break;
                case 4:
                    CDUtils.sortCDsByPriceDesOrder(CDs);
                    break;
                case 5:
                    CDUtils.sortCdsByNameAscOrder(CDs);
                    break;
                case 6:
                    CDUtils.printfCDs(CDs);
                    break;
            }
        } while (selection != 7);
    }
}
