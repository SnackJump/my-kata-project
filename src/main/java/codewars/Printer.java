package codewars;

import java.util.regex.Pattern;

/**
 * Title: Printer<br> Description:<br> Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
public class Printer {

  public static String printerError(String s) {
    return s.replaceAll("[a-m]", "").length() + "/" + s.length();
//    int errorCount = 0;
//    for (char c : s.toCharArray()) {
//      String word = String.valueOf(c);
//      if (!Pattern.matches("[a-m]", word)) {
//        ++errorCount;
//      }
//    }
//    return errorCount + "/" + s.length();
  }
}
