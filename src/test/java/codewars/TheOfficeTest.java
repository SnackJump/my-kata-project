package codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Title: TheOfficeTest<br>
 * Description:<br>
 * Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/6
 */
class TheOfficeTest {
  @Test
  void basic1() {
    Person[] meet =
        new Person[] {
          new Person("tim", 0),
          new Person("jim", 2),
          new Person("randy", 0),
          new Person("sandy", 7),
          new Person("andy", 0),
          new Person("katie", 5),
          new Person("laura", 1),
          new Person("saajid", 2),
          new Person("alex", 3),
          new Person("john", 2),
          new Person("mr", 0)
        };
    assertEquals("Get Out Now!", TheOffice.outed(meet, "laura"));
  }

  @Test
  void basic2() {
    Person[] meet =
        new Person[] {
          new Person("tim", 1),
          new Person("jim", 3),
          new Person("randy", 9),
          new Person("sandy", 6),
          new Person("andy", 7),
          new Person("katie", 6),
          new Person("laura", 9),
          new Person("saajid", 9),
          new Person("alex", 9),
          new Person("john", 9),
          new Person("mr", 8)
        };
    assertEquals("Nice Work Champ!", TheOffice.outed(meet, "katie"));
  }

  @Test
  void basic3() {
    Person[] meet =
        new Person[] {
          new Person("tim", 2),
          new Person("jim", 4),
          new Person("randy", 0),
          new Person("sandy", 5),
          new Person("andy", 8),
          new Person("katie", 6),
          new Person("laura", 2),
          new Person("saajid", 2),
          new Person("alex", 3),
          new Person("john", 2),
          new Person("mr", 8),
        };
    assertEquals("Get Out Now!", TheOffice.outed(meet, "john"));
  }

  @Test
  void basic4() {
    Person[] meet =
        new Person[] {
            new Person("tim", 5),
            new Person("jim", 5),
            new Person("randy", 5),
            new Person("sandy", 5)
        };
    assertEquals("Get Out Now!", TheOffice.outed(meet, "john"));
  }
  @Test
  void basic5() {
    Person[] meet =
        new Person[] {
            new Person("tim", 6),
            new Person("jim", 5),
            new Person("randy", 5),
            new Person("sandy", 5)
        };
    assertEquals("Nice Work Champ!", TheOffice.outed(meet, "john"));
  }
}
