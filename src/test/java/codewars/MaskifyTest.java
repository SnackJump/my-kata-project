package codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Title: MaskifyTest<br>
 * Description:<br>
 * Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
class MaskifyTest {

  @Test
  void testSolution() {
    assertEquals("############5616", Maskify.maskify("4556364607935616"));
    assertEquals("############5616", Maskify.maskify("4556364607935616"));
    assertEquals("#######5616", Maskify.maskify("64607935616"));
    assertEquals("1", Maskify.maskify("1"));
    assertEquals("", Maskify.maskify(""));
    //
    //    // "What was the name of your first pet?"
    assertEquals("##ippy", Maskify.maskify("Skippy"));
    assertEquals(
        "####################################man!",
        Maskify.maskify("Nananananananananananananananana Batman!"));
  }
}
