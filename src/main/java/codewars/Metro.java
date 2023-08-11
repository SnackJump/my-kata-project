package codewars;

import java.util.ArrayList;

/**
 * Title: Metro<br> Description:<br> Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/6/30
 */
public class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
    return stops.stream().mapToInt(customer -> customer[0] - customer[1]).sum();
  }
}
