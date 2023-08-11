package pdt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Title: GameTest<br>
 * Description:<br>
 * 保齡球<br>
 * https://rwang.medium.com/uncle-bob-%E7%9A%84%E4%BF%9D%E9%BD%A1%E7%90%83%E5%A5%97%E8%B7%AF-95c268075d7d
 * <br>
 * 1. 一場保齡球共有十局(frame)，每局有十隻球瓶(pin)，最高可打兩球，最高可得十分。<br>
 * 2. 第一球十隻球瓶全倒稱為Strike，第二球才把剩下的打倒稱為Spare。<br>
 * 3. 每局計分方式為倒下的瓶數，如果有Strike或是Spare可再加上Bonus。<br>
 * 4. Strike的Bonus為，下兩球倒下的瓶數加總。<br>
 * 5. Spare的Bonus為，下一球倒下的瓶數。<br>
 * 6. 第十局沒有Bonus，但Strike可再打兩球 或Spare可再打一球。<br>
 * 7. 如果十局的第一球皆為全倒，則稱為Perfect Game，滿分為300，總球數為12。<br>
 *
 * @version 修訂記錄:<br>
 * @since 2022/7/14
 */
class GameTest {
  Game game = new Game();

  @Test
  @DisplayName("十局的20球皆掛零，得0分")
  void testAllZeros() {
    rollMany(0, 20);
    Assertions.assertEquals(0, game.score());
  }

  @Test
  @DisplayName("十局的20球皆掛零，但又再打一球，噴錯")
  void testThrowExceptionWhenRoll11Times() {
    rollMany(0, 20);
    RuntimeException runtimeException =
        Assertions.assertThrows(RuntimeException.class, () -> game.roll(0));
    Assertions.assertEquals("No Ball to play", runtimeException.getMessage());
    Assertions.assertEquals(0, game.score());
  }

  @Test
  @DisplayName("十局的20球皆得一分，得20分")
  void testAllOnes() {
    rollMany(1, 20);
    Assertions.assertEquals(20, game.score());
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
    rollStrike();
    game.roll(3);
    game.roll(4);
    rollMany(0, 16);
    RuntimeException runtimeException =
        Assertions.assertThrows(RuntimeException.class, () -> game.roll(0));
    Assertions.assertEquals("No Ball to play", runtimeException.getMessage());
    Assertions.assertEquals(24, game.score());
  }

  @Test
  @DisplayName("第一局即發生 Strike，第二局第一球得3分第二球4分，其餘1分，得40分")
  void testOneStrikeOther1() {
    rollStrike();
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
    Assertions.assertEquals("No Ball to play", runtimeException.getMessage());
    Assertions.assertEquals(300, game.score());
  }

  @Test
  @DisplayName("第9局0分其餘皆為Strike，可加碼打兩球，這兩球也是 Strike。得250分")
  void testStrike2() {
    rollMany(10, 8);
    game.roll(0);
    game.roll(0);
    rollMany(10, 3);
    Assertions.assertEquals(250, game.score());
  }

  private void rollStrike() {
    game.roll(10);
  }

  private void rollMany(int score, int times) {
    for (int i = 0; i < times; i++) {
      System.out.println("i=" + i);
      game.roll(score);
    }
  }
}
