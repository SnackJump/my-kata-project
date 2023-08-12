package codewars.kyu5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Title: SumFctTest<br>
 * Description:<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/7
 */
class SumFctTest {

  @Test
  void test1() {
    assertEquals(BigInteger.valueOf(80), SumFct.perimeter(BigInteger.valueOf(5)));
  }
  @Test
  @Disabled
  void test2() {
    assertEquals(BigInteger.valueOf(216), SumFct.perimeter(BigInteger.valueOf(7)));
  }
  @Test
  @Disabled
  void test3() {
    assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(BigInteger.valueOf(30)));
  }

}
