package codewars.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import codewars.kyu6.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Title: SolutionTest<br>
 * Description:<br>
 * Company: Tradevan Co.<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/1
 */
class SolutionTest {

  @Test
  void test_solution_0() {
    assertEquals(0, new Solution().solution(0));
  }

  @Test
  void test_solution_negative() {
    assertEquals(0, new Solution().solution(-10));
  }

  @Test
  void test_solution_4() {
    assertEquals(3, new Solution().solution(4));
  }

  @Test
  void test_solution_6() {
    assertEquals(8, new Solution().solution(6));
  }

  @Test
  void test_solution_7() {
    assertEquals(14, new Solution().solution(7));
  }

  @Test
  void test_solution_10() {
    assertEquals(23, new Solution().solution(10));
  }

  @Test
  void testZeros() throws Exception {
    Assertions.assertEquals(0, Solution.zeros(0));
    Assertions.assertEquals(1, Solution.zeros(6));
    Assertions.assertEquals(2, Solution.zeros(12));
    Assertions.assertEquals(2, Solution.zeros(14));
  }

  @Test
  void testZeros_double() throws Exception {
    Assertions.assertEquals(6, Solution.zeros(25));
    Assertions.assertEquals(12, Solution.zeros(50));
    Assertions.assertEquals(18, Solution.zeros(75));
  }

  @Test
  void testZeros_triple() throws Exception {
    Assertions.assertEquals(31, Solution.zeros(125));
  }

  @Test
  void testZeros_max_int() throws Exception {
    Assertions.assertEquals(536870902, Solution.zeros(Integer.MAX_VALUE));
  }

  @Test
  public void testSomeUnderscoreLowerStart() {
    String input = "the_Stealth_Warrior";
    assertEquals("theStealthWarrior", Solution.toCamelCase(input));
  }
  @Test
  public void testSomeUnderscoreLowerStart_theStealthWarrior() {
    assertEquals("theStealthWarrior", Solution.toCamelCase("the-stealth-warrior"));
  }
  @Test
  public void testSomeUnderscoreLowerStart_TheStealthWarrior() {
    assertEquals("TheStealthWarrior", Solution.toCamelCase("The_Stealth_Warrior"));
  }
}
