package codewars.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Title: StopGninnipSMySdroW<br>
 * Description:<br>
 * <br>
 * spinWords()<br>
 * 編寫一個函數，該函數接收一個或多個單詞的字串，並返回相同的字串，但所有五個或更多個字母單詞都反轉<br>
 * （就像此 Kata 的名稱一樣）。傳入的字串將僅由字母和空格組成。僅當存在多個單詞時，才會包含空格。<br>
 * https://www.codewars.com/kata/5264d2b162488dc400000001/train/java<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/2
 */
public class StopGninnipSMySdroW {

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" ")).map(this::reverse).collect(Collectors.joining(" "));
    }

    private String reverse(String world) {
        if (world.length() < 5) {
            return world;
        } else {
            return new StringBuilder(world).reverse().toString();
        }
    }
}
