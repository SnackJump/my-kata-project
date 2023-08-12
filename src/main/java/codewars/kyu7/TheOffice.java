package codewars.kyu7;

import java.util.Arrays;

/**
 * Title: TheOffice<br>
 * Description:<br>
 * outed()<br>
 * https://www.codewars.com/kata/57ecf6efc7fe13eb070000e1/train/java<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/6
 */
public class TheOffice {

  public static String outed(Person[] meet, String boss) {
    double teamHappiness =
        Arrays.stream(meet)
            .mapToInt(
                person -> boss.equals(person.name) ? person.happiness * 2 : person.happiness)
            .average()
            .orElse(0.0);
    return teamHappiness <= 5 ? "Get Out Now!" : "Nice Work Champ!";
  }

  public static String outed1(Person[] meet, String boss) {
    int teamHappiness = 0;
    for (Person person : meet) {
      if (boss.equals(person.name)) {
        teamHappiness += person.happiness * 2;
      } else {
        teamHappiness += person.happiness;
      }
    }

    return (teamHappiness / (double) meet.length) <= 5 ? "Get Out Now!" : "Nice Work Champ!";
  }
}

class Person {
  final String name; // team memnber's name
  final int happiness; // happiness rating out of 10

  Person(String name, int happiness) {
    this.name = name;
    this.happiness = happiness;
  }

  public String getName() {
    return name;
  }

  public int getHappiness() {
    return happiness;
  }
}
