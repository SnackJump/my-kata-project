package codewars.kyu8;

/**
 * Title: Greeter<br>
 * Description:<br>
 * https://www.codewars.com/kata/55225023e1be1ec8bc000390/train/java
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2023/8/12
 */
public class Greeter {

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);
    }
}
