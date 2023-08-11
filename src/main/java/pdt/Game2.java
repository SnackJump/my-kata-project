package pdt;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title: Game2<br>
 * Description:<br>
 * Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/21
 */
public class Game2 {
  int[] games = new int[23];
  int currentStep = 0;

  public void roll(int point) {
    games[currentStep] = point;
    ++currentStep;
    if (point == 10) {
      ++currentStep;
    }
  }

  public int score() {
    int total = 0;
    for (int i = 0; i < 20; i++) {
      total += games[i];

      if (hasBouns(i)) {
        if (games[i] == 10) {
          total += games[i + 2];
          if (games[i + 2] == 10) {
            total += games[i + 4];
          } else {
            total += games[i + 3];
          }

        } else if ((games[i] + games[i + 1] == 10)) {
          total += games[i + 2];
        }
      }
      //      if(games[i] != 0){
      //
      //        System.out.println(i + ":"+total + ":"+hasBouns(i));
      //      }
    }

    return total;
  }

  private boolean hasBouns(int i) {
    return i % 2 == 0 && i < 20;
  }
}
