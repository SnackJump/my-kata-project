package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Title: DuplicateEncoder<br>
 * Description:<br>
 *
 * @version 修訂記錄:<br>
 * @since 2022/7/1
 */
public class DuplicateEncoder {

  static String encode(String word) {
    String finalWord = word.toLowerCase();
    return finalWord
        .chars()
        .mapToObj(i -> String.valueOf((char) i))
        .map(i -> (finalWord.indexOf(i) == finalWord.lastIndexOf(i)) ? "(" : ")")
        .collect(Collectors.joining());

    //    return word.toLowerCase()
    //        .chars()
    //        .mapToObj(i -> String.valueOf((char)i))
    //        .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" :
    // ")")
    //        .collect(Collectors.joining());

    //    word = word.toLowerCase();
    //    int[] times = new int[word.length()];
    //    char[] chars = word.toCharArray();
    //    for (int i = 0; i < chars.length; i++) {
    //      int finalI = i;
    //      times[i] = (int) word.chars().filter(j -> j == chars[finalI]).count();
    //    }
    //    StringBuilder output = new StringBuilder();
    //    Arrays.stream(times).forEach(time -> {
    //      if (time == 1) {
    //        output.append("(");
    //      } else {
    //        output.append(")");
    //      }
    //    });
    //
    //    return output.toString();
  }
}
