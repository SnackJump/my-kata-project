package codewars.kyu6;

import java.math.BigDecimal;

/**
 * Title: ASum<br>
 * Description:<br>
 * <br>
 * findNb()<br>
 * 你的任務是建造一座建築物，這將是一堆n個立方體。底部的立方體的體積為n^3，上面的立方體的體積為（n-1）^3，<br>
 * 依此類推，直到頂部的體積為1^3。<br>
 * 您將獲得建築物的總體積m。給定m，你能找到你必須構建的n個立方體嗎？<br>
 * https://www.codewars.com/kata/5592e3bd57b64d00f3000047/train/java<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/2
 */
public class ASum {

  public static long findNb(long m) {
    long mm = 0, n = 0;
    while (mm < m) mm += ++n * n * n;
    return mm == m ? n : -1;
  }

  public static long findNb_my(long m) {
    BigDecimal bigDecimalM = new BigDecimal(m);
    int currentNum = 0;

    BigDecimal sum = new BigDecimal(0);
    do {
      ++currentNum;
      sum = sum.add(new BigDecimal(currentNum).pow(3));
    } while (sum.compareTo(bigDecimalM) < 0);

    return (sum.compareTo(bigDecimalM) == 0) ? currentNum : -1;
  }
}
