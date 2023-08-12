package codewars.kyu4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * Title: Kata<br>
 * Description:<br>
 * nextSmaller()<br>
 * https://www.codewars.com/kata/5659c6d896bc135c4c00021e/train/java<br>
 *
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
public class Kata {

  public static String highAndLow(String numbers) {
    IntSummaryStatistics intSummaryStatistics =
        Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
    return intSummaryStatistics.getMax() + " " + intSummaryStatistics.getMin();

    //    String[] numberAry = numbers.split(" ");
    //    int min = Integer.parseInt(numberAry[0]);
    //    int max = min;
    //    int currentNum;
    //    for (String num : numberAry) {
    //      currentNum = Integer.parseInt(num);
    //      if (min > currentNum) {
    //        min = currentNum;
    //      }
    //      if (max < currentNum) {
    //        max = currentNum;
    //      }
    //    }
    //
    //    return String.format("%s %s", max, min);
  }

  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);

    //    int position = str.lastIndexOf(ending);
    //    return (position >= 0 && str.length() == ending.length() + position);
  }


  public static long nextSmaller(long n) {
    String numberStr = String.valueOf(n);
    List<String> numberLists = Arrays.asList(numberStr.split(""));
    return permutationNoRepeat(numberLists, numberStr.length(), numberStr);
  }

  public static Integer permutationNoRepeat(List<String> numberLists, int numberLength, String myNumber) {
    Stream<String> stream = numberLists.stream();
    /*把排列組合都做好*/
    for (int n = 1; n < numberLength; n++) {
      stream = stream.flatMap(str -> numberLists.stream()
          .filter(temp -> !str.contains(temp))
          .map(str::concat));
    }

    /*取出比我帶進來的數字還要小的"所有數字"然後取最大值*/
    Optional<String> max = stream.
        filter(number -> Integer.parseInt(number) < Integer.parseInt(myNumber))
        .max(Comparator.comparing(String::valueOf));
    //找不到最大值了就是回傳-1
    return max.map(Integer::parseInt).orElse(-1);
  }





  public static long nextSmaller1(long n) {
    TreeMap<Integer, Integer> numbers = new TreeMap<>(Collections.reverseOrder()); // 數字、出現次數

    String nStr = String.valueOf(n);
    int currentNum = 0;
    int preNum = 0;

    for (int i = nStr.length() - 1; i >= 0; --i) {
      currentNum = nStr.charAt(i) - '0';
      if (numbers.size() == 0) {
        numbers.put(currentNum, 1);
      } else if (numbers.containsKey(currentNum)) {
        int times = numbers.get(currentNum);
        numbers.put(currentNum, ++times);
      } else if (currentNum < numbers.firstKey() && currentNum < preNum) {
        numbers.put(currentNum, 1);
      } else {
        StringBuilder preStr = new StringBuilder();
        if (i > 0) {
          preStr.append(nStr.substring(0, i));
        }
        preStr.append(numbers.firstKey());
        preStr.append(currentNum);
        if (numbers.get(numbers.firstKey()) > 1) {
          int times = numbers.get(numbers.firstKey());
          numbers.put(numbers.firstKey(), --times);
        } else {
          numbers.remove(numbers.firstKey());
        }
        for (Integer num : numbers.keySet()) {
          for (int j = 0; j < numbers.get(num); j++) {
            preStr.append(num);
          }
        }
        return Long.parseLong(preStr.toString());
      }
      preNum = currentNum;
    }

    return -1;
  }
}
