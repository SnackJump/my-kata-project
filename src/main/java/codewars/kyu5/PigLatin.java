package codewars.kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Title: PigLatin<br>
 * Description:<br>
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2023/9/13
 */
public class PigLatin {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
    public static String pigIt1(String str) {
        System.out.println("str = " + str);
        return Arrays.stream(str.split(" "))
                .map(word -> {
                    if (word.matches("[a-zA-Z]*")) {
                        return (word.length() > 1 ? word.substring(1) + word.charAt(0) : word) + "ay";
                    } else {
                        return word;
                    }
                })
                .collect(Collectors.joining(" "));
    }
}
