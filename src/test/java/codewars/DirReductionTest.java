package codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Title: DirReductionTest<br>
 * Description:<br>
 * Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/1
 */
class DirReductionTest {

  @Test
  public void testSimpleDirReduc_1() {
    Assertions.assertArrayEquals(
        new String[] {"WEST"},
        DirReduction.dirReduc(
            new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

  }
  @Test
  public void testSimpleDirReduc_2() {
    Assertions.assertArrayEquals(
        new String[] {},
        DirReduction.dirReduc(new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"}));
  }
}
