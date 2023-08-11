package pdt;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Game<br>
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
public class Game {
  int totalScore = 0;
  List<Integer> scoreList = new ArrayList<>();
  int totalBall = 20;
  int currentBall = 0;

  public void roll(int score) {
    if (totalBall == currentBall) {
      throw new RuntimeException("No Ball to play");
    }
    totalScore += score;
    scoreList.add(score);

    ++currentBall;
    if (score == 10) {
      if (currentBall < 20) {
        ++currentBall;
      }
      if (currentBall == 20) {
        totalBall += 2;
      }
    }
    System.out.println("score=" + score + ", currentBall=" + currentBall);

    //    if (hasBonus) {
    if ((scoreList.size() % 2 == 1)
        && (scoreList.size() > 2)
        && (scoreList.get(scoreList.size() - 3) + scoreList.get(scoreList.size() - 2) == 10)) {
      totalScore += score;
    }
    if ((scoreList.size() > 1) && (scoreList.get(scoreList.size() - 2) == 10) && currentBall <=21) {
      totalScore += score;
    }
    if ((scoreList.size() > 2) && (scoreList.get(scoreList.size() - 3) == 10) && currentBall <=20) {
      totalScore += score;
    }
    //    }
  }

  public int score() {
    return totalScore;
  }
}
