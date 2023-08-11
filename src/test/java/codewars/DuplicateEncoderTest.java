package codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Title: DuplicateEncoderTest<br> Description:<br> Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/1
 */
public class DuplicateEncoderTest {

  @Test
  public void test() {
    assertEquals("(((", DuplicateEncoder.encode("din"));
    assertEquals("()()()", DuplicateEncoder.encode("recede"));
    assertEquals(")())())", DuplicateEncoder.encode("Success"));
    assertEquals("))((", DuplicateEncoder.encode("(( @"));
    assertEquals(")()())()(()()(",
        DuplicateEncoder.encode("Prespecialized"));
    assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
  }
}
