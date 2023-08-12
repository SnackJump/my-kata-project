package codewars.kyu7;

import java.util.Arrays;

/**
 * Title: Divisible<br>
 * Description:<br>
 * https://www.codewars.com/kata/558ee8415872565824000007/train/java
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2023/8/12
 */
public class Divisible {
    public static boolean isDivisible(int... i) {
        int first = i[0];
        return Arrays.stream(i).allMatch(num -> first % num == 0);
    }
}
