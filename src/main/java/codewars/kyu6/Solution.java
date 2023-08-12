package codewars.kyu6;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Title: Solution<br>
 * Description:<br>
 * solution() <br>
 * 如果我們列出所有低於10的自然數，它們是3或5的倍數，我們得到3，5，6和9。這些倍數之和為 23。<br>
 * 完成解決方案，使其返回傳入數位以下的所有 3 或 5 的倍數之和。此外，如果該數位為負數，則返回 0（對於具有這些數位的語言）。<br>
 * 注意：如果該數位是 3 和 5 的倍數，則只計算一次。<br>
 * zeros() <br>
 * 編寫一個程式，該程式將計算給定數位的階乘中尾隨零的數目。<br>
 * toCamelCase()<br>
 * 將字串轉換為駝峰大小寫<br>
 * Convert string to camel case<br>
 * https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/1
 */
public class Solution {

  public static int zeros(int n) {
    int result = 0;
    do {
      n = (int) IntStream.rangeClosed(1, n).filter(j -> (j % 5 == 0)).count();
      result += n;
    } while (n > 0);

    return result;
  }

  static String toCamelCase(String s) {
    String[] s1 = s.split("[_-]");
    StringBuilder sb = new StringBuilder(s1[0]);
    for (int i = 1; i < s1.length; i++) {
      sb.append(s1[i].substring(0, 1).toUpperCase()).append(s1[i].substring(1).toLowerCase());
    }
    return sb.toString();
  }

  static String toCamelCase_1(String s){
    return Pattern.compile("[-|_](.)").matcher(s).replaceAll(r -> r.group(1).toUpperCase());
  }

  public int solution(int number) {
    return IntStream.range(1, number).filter(i -> (i % 3 == 0 || i % 5 == 0)).sum();
  }

  public int solution1(int number) {
    if (number <= 0) {
      return 0;
    }
    int sum = 0;
    for (int i = 0; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum += i;
      }
    }

    return sum;
  }
}
