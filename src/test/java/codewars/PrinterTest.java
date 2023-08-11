package codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Title: PrinterTest<br>
 * Description:<br>
 * Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
class PrinterTest {

  @Test
  void test_0_14() {
    System.out.println("printerError Fixed Tests");
    String s = "aaabbbbhaijjjm";
    assertEquals("0/14", Printer.printerError(s));
  }

  @Test
  void test_8_22() {
    System.out.println("printerError Fixed Tests");
    String s = "aaaxbbbbyyhwawiwjjjwwm";
    assertEquals("8/22", Printer.printerError(s));
  }

  @Test
  void test() {
    System.out.println("printerError Fixed Tests");
    String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
    assertEquals("3/56", Printer.printerError(s));
  }
}
