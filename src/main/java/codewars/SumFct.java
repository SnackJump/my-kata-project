package codewars;

import java.math.BigInteger;

/**
 * Title: SumFct<br>
 * Description:<br>
 * perimeter()<br>
 * 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80<br>
 * https://www.codewars.com/kata/559a28007caad2ac4e000083/train/java<br>
 * https://zh.m.wikipedia.org/zh-tw/%E6%96%90%E6%B3%A2%E9%82%A3%E5%A5%91%E6%95%B0<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/7
 */
public class SumFct {
  public static BigInteger perimeter(BigInteger n) {
    return fibonacci(n).add(fibonacci(n.subtract(new BigInteger("1")))).multiply(new BigInteger("4"));
  }

  private static BigInteger fibonacci(BigInteger n) {
    if(n.compareTo(new BigInteger("1")) == 0){
      return new BigInteger("2");
    }

return null;
  }

}
