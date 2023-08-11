package codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Title: test.BitCountingTest<br>
 * Description:<br>
 * Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
class BitCountingTest {
  @Test
  void testGame() {
    assertEquals(5, BitCounting.countBits(1234));
    assertEquals(1, BitCounting.countBits(4));
    assertEquals(3, BitCounting.countBits(7));
    assertEquals(2, BitCounting.countBits(9));
    assertEquals(2, BitCounting.countBits(10));
  }
}
