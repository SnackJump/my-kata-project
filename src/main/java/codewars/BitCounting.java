package codewars;

/**
 * Title: BitCounting<br>
 * Description:<br>
 *
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
public class BitCounting {

  public static int countBits(int n) {
    return (int) Integer.toBinaryString(n).chars().filter(c -> c == '1').count();

    //    return Integer.toBinaryString(n).replace("0", "").length();
  }
}
