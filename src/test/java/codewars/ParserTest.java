package codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Title: ParserTest<br>
 * Description:<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/23
 */
public class ParserTest {

  @Test
  public void fixedTests() {
    assertEquals(1, Parser.parseInt("one"));
    assertEquals(20, Parser.parseInt("twenty"));
    assertEquals(246, Parser.parseInt("two hundred forty-six"));
  }

  @Test
  public void fixedTests_783919() {
    assertEquals(
        783919, Parser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
  }

  @Test
  public void fixedTests_13() {
    assertEquals(13, Parser.parseInt("thirteen"));
  }

  @Test
  public void fixedTests_0() {
    assertEquals(0, Parser.parseInt("zero"));
  }
}
