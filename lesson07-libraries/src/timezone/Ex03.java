package timezone;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

public class Ex03 {
    public static void main(String[] args) {
        BigDecimal digit = BigDecimal.valueOf(52354869.56318d);
        System.out.println("digit: " + digit);

        // Rounding
        digit = digit.setScale(2, RoundingMode.HALF_UP);

        System.out.println("rounding: " + digit);

        // singleton => ONE instance => at same context time


        Calendar c1 = Calendar.getInstance();
        // C1 => 10:10:10 5263

        Calendar c2 = Calendar.getInstance();
        // C2 => 10:10:10 5264
    }
}
