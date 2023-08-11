package codewars;

/**
 * Title: Maskify<br> Description:<br> Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
public class Maskify {

  public static String maskify(String input) {
    if (input.length() <= 4) {
      return input;
    }
    StringBuilder mask = new StringBuilder();
    for (int i = 0; i < input.length() - 4; ++i) {
      mask.append("#");
    }
    return mask.append(input.substring(input.length() - 4)).toString();
  }
}
