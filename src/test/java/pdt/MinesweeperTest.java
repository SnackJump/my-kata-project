package pdt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Title: Minesweeper<br>
 * Description:<br>
 * Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/1
 */
class MinesweeperTest {

  @Test
  void test_error_when_map_format_not_correct() {
    RuntimeException runtimeException =
        Assertions.assertThrows(RuntimeException.class, () -> new Minesweeper("-4"));
    Assertions.assertEquals("Map format fail!", runtimeException.getMessage());
  }

  @Test
  void test_error_when_map_format_is_0() {
    RuntimeException runtimeException =
        Assertions.assertThrows(RuntimeException.class, () -> new Minesweeper("0 0"));
    Assertions.assertEquals("Map format fail!", runtimeException.getMessage());
  }

  @Test
  void test_error_when_input_integer() {
    NumberFormatException runtimeException =
        Assertions.assertThrows(NumberFormatException.class, () -> new Minesweeper("s s"));
  }

  @Test
  void test_error_when_input_negative() {
    RuntimeException runtimeException =
        Assertions.assertThrows(RuntimeException.class, () -> new Minesweeper("-4 -4"));
    Assertions.assertEquals("Map format fail!", runtimeException.getMessage());
  }

  @Test
  void test_error_when_map_length_size_not_correct() {
    RuntimeException runtimeException =
        Assertions.assertThrows(RuntimeException.class, () -> new Minesweeper("4 4\r\n" + "*..."));
    Assertions.assertEquals(
        "Map length size not correct, length is 4, but input is 1", runtimeException.getMessage());
  }

  @Test
  void test_error_when_map_wight_size_not_correct() {
    RuntimeException runtimeException =
        Assertions.assertThrows(
            RuntimeException.class,
            () -> new Minesweeper("4 4\r\n" + "*...\r\n" + "....\r\n" + ".*..\r\n" + "...\r\n"));
    Assertions.assertEquals(
        "Map length size not correct, at length 4, wight is 4, but input is 3",
        runtimeException.getMessage());
  }

  @Test
  void test_4_4_2() {
    String result = "*100\r\n" + "2210\r\n" + "1*10\r\n" + "1110\r\n";

    Minesweeper minesweeper =
        new Minesweeper("4 4\r\n" + "*...\r\n" + "....\r\n" + ".*..\r\n" + "....\r\n");
    Assertions.assertEquals(result, minesweeper.scan());
  }

  @Test
  void test_3_5_3() {
    String result = "**100\r\n" + "33200\r\n" + "1*100\r\n";

    Minesweeper minesweeper = new Minesweeper("3 5\r\n" + "**...\r\n" + ".....\r\n" + ".*...\r\n");
    Assertions.assertEquals(result, minesweeper.scan());
  }
}
