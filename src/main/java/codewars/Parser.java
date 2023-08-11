package codewars;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Parser<br>
 * Description:<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/23
 */
public class Parser {
  public static Map<String, String> numberMapping = new HashMap<>();

  static {
    numberMapping.put("zero", "0");
    numberMapping.put("one", "1");
    numberMapping.put("two", "2");
    numberMapping.put("three", "3");
    numberMapping.put("four", "4");
    numberMapping.put("five", "5");
    numberMapping.put("six", "6");
    numberMapping.put("seven", "7");
    numberMapping.put("eight", "8");
    numberMapping.put("nine", "9");
    numberMapping.put("ten", "10");
    numberMapping.put("eleven", "11");
    numberMapping.put("twelve", "12");
    numberMapping.put("thirteen","13");
    numberMapping.put("fourteen","14");
    numberMapping.put("fifteen","15");
    numberMapping.put("sixteen","16");
    numberMapping.put("seventeen","17");
    numberMapping.put("eighteen","18");
    numberMapping.put("nineteen", "19");
    numberMapping.put("twenty", "20");
    numberMapping.put("forty", "4");
    numberMapping.put("hundred", "");
    numberMapping.put("thousand", "");
    numberMapping.put("and", "");
  }

  public static int parseInt(String numStr) {
    System.out.println("==>"+numStr);
    String[] oneWorld = numStr.split("[ -]");
    StringBuilder convertToNumber = new StringBuilder();
    for (int i = 0; i < oneWorld.length; i++) {
      String world = oneWorld[i];
      if(!numberMapping.containsKey(world)){
        System.out.println(world);
      }
      convertToNumber.append(numberMapping.get(world));
    }
    return Integer.parseInt(convertToNumber.toString());
  }
}
