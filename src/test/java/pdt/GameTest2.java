package pdt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Title: MinesweeperTest2<br> Description:<br> Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/21
 */
public class GameTest2 {

  Game2 game = new Game2();

  @Test
  @DisplayName("十局的20球皆掛零，得0分")
  void testAllZeros() {
    rollMany(0, 20);
    Assertions.assertEquals(0, game.score());
  }

  @Test
  @DisplayName("十局的20球皆得一分，得20分")
  void testAllOnes() {
    rollMany(1, 20);
    Assertions.assertEquals(20, game.score());
  }
  private void rollMany(int point,int times) {
    for (int i = 0; i < times; i++) {
      game.roll(point);
    }
  }

  @Test
  @DisplayName("第一局即發生 Spare，第二局第一球得3分，其餘0分，得16分")
  void testOneSpareOther0() {
    game.roll(3);
    game.roll(7);
    game.roll(3);
    rollMany(0, 17);
    Assertions.assertEquals(16, game.score());
  }

  @Test
  @DisplayName("第一局即發生 Spare，第二局第一球得3分，其餘1分，得33分")
  void testOneSpareOther1() {
    game.roll(3);
    game.roll(7);
    game.roll(3);
    rollMany(1, 17);
    Assertions.assertEquals(33, game.score());
  }


  @Test
  @DisplayName("第一局即發生 Strike，第二局第一球得3分第二球4分，其餘0分，得24分")
  void testOneStrikeOther0() {
    game.roll(10);
    game.roll(3);
    game.roll(4);
    rollMany(0, 16);
//    RuntimeException runtimeException =
//        Assertions.assertThrows(RuntimeException.class, () -> game.roll(0));
//    Assertions.assertEquals("No Ball to play", runtimeException.getMessage());
    Assertions.assertEquals(24, game.score());
  }

  @Test
  @DisplayName("第一局即發生 Strike，第二局第一球得3分第二球4分，其餘1分，得40分")
  void testOneStrikeOther1() {
    game.roll(10);
    game.roll(3);
    game.roll(4);
    rollMany(1, 16);
    Assertions.assertEquals(40, game.score());
  }

  @Test
  @DisplayName("十局皆為Strike，並可加碼打兩球，這兩球也是 Strike。得300分")
  void testPerfectGame() {
    rollMany(10, 12);
    RuntimeException runtimeException =
        Assertions.assertThrows(RuntimeException.class, () -> game.roll(0));
//    Assertions.assertEquals("No Ball to play", runtimeException.getMessage());
    Assertions.assertEquals(300, game.score());
  }
}
