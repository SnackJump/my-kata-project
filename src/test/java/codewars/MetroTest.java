package codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * Title: MetroTest<br> Description:<br> Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
public class MetroTest {
  Metro metro = new Metro();

  @Test
  public void test_10() {
    ArrayList<int[]> list = new ArrayList<int[]>();
    list.add(new int[] {10,0});
    assertEquals(10, metro.countPassengers(list));
  }
  @Test
  public void test_8() {
    ArrayList<int[]> list = new ArrayList<int[]>();
    list.add(new int[] {10,0});
    list.add(new int[] {3,5});
    assertEquals(8, metro.countPassengers(list));
  }

  @Test
  public void test1() {
    ArrayList<int[]> list = new ArrayList<int[]>();
    list.add(new int[] {10,0});
    list.add(new int[] {3,5});
    list.add(new int[] {2,5});
    assertEquals(5, metro.countPassengers(list));
  }


}
