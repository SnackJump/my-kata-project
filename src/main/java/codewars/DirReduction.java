package codewars;

import java.util.Arrays;

/**
 * Title: DirReduction<br>
 * Description:<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/1
 */
public class DirReduction {
  public static String[] dirReduc(String[] arr) {
    StringBuilder sb = new StringBuilder();
    Arrays.stream(arr).forEach(s -> sb.append(s + " "));
    String oriStr = sb.toString();
    String newStr = "";

    while (true) {
      newStr =
          oriStr
              .replaceAll("NORTH SOUTH ", "")
              .replaceAll("SOUTH NORTH ", "")
              .replaceAll("EAST WEST ", "")
              .replaceAll("WEST EAST ", "");

      if (oriStr.length() == newStr.length()) {
        break;
      }
      oriStr = newStr;
    }

    return newStr.isBlank() ? new String[] {} : newStr.split(" ");
  }
}
