package codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Title: KataTest<br> Description:<br> Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
class KataTest {

  @Test
  void test1() {
    assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
  }

  @Test
  void test2() {
    assertEquals("3 1", Kata.highAndLow("1 2 3"));
  }


  @Test
  void staticTests() {
    check("samurai", "ai", true);
    check("sumo", "omo", false);
    check("ninja", "ja", true);
    check("sensei", "i", true);
    check("samurai", "ra", false);
    check("abc", "abcd", false);
    check("abc", "abc", true);
    check("abcabc", "bc", true);
    check("ails", "fails", false);
    check("fails", "ails", true);
    check("this", "fails", false);
    check("this", "", true);
    check(":-)", ":-(", false);
    check("!@#$%^&*() :-)", ":-)", true);
    check("abc\n", "abc", false);
  }

  private static void check(String str, String ending, boolean expected) {
    boolean result = Kata.solution(str, ending);
    assertEquals(
        expected, result,
        "Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
  }

  @Test
  public void basicTests_12() {
    assertEquals(-1, Kata.nextSmaller(12));
  }

  @Test
  public void basicTests_21() {
    assertEquals(12, Kata.nextSmaller(21));
  }

  @Test
  public void basicTests_907() {
    assertEquals(790, Kata.nextSmaller(907));
  }

  @Test
  public void basicTests_970() {
    assertEquals(907, Kata.nextSmaller(970));
  }

  @Test
  public void basicTests_977() {
    assertEquals(797, Kata.nextSmaller(977));
  }
  @Test
  public void basicTests_1027() {
    assertEquals(-1, Kata.nextSmaller(1027));
  }

  @Test
  public void basicTests() {
    assertEquals(513, Kata.nextSmaller(531));
    assertEquals(414, Kata.nextSmaller(441));
    assertEquals(123456789, Kata.nextSmaller(123456798));
  }

  @Test
  public void basicTests_91459() {
    assertEquals(19954, Kata.nextSmaller(91459));
  }


  @Test
  public void basicTests_15499() {
    assertEquals(14995, Kata.nextSmaller(15499));
  }

}
