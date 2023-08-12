package codewars.kyu7;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Title: DecimalTimeConversion<br>
 * Description: https://www.codewars.com/kata/6397b0d461067e0030d1315e/train/java <br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2023/8/8
 */
public class DecimalTimeConversion {
    public static double toIndustrial(String time) {
        String[] data = time.split(":");
        BigDecimal min = new BigDecimal(data[1]).divide(new BigDecimal(60), 2, RoundingMode.HALF_UP);
        BigDecimal hour = new BigDecimal(data[0]);

        return hour.add(min).doubleValue();
    }

    public static double toIndustrial(int time) {
        return BigDecimal.valueOf(time).divide(new BigDecimal(60), 2, RoundingMode.HALF_UP).doubleValue();
    }

    public static String toNormal(double time) {
        BigDecimal original = BigDecimal.valueOf(time);
        String hour = String.valueOf(original.intValue());
        int min = original.subtract(BigDecimal.valueOf(original.intValue()))
                .multiply(new BigDecimal(60))
                .setScale(0, RoundingMode.HALF_UP).intValue();

        return hour + ":" + ((min<10)? "0"+ min : String.valueOf(min));
    }
}
