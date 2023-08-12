package codewars.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import codewars.kyu6.SpinWords;
import org.junit.jupiter.api.Test;

/**
 * Title: SpinWordsTest<br>
 * Description:<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/2
 */
public class SpinWordsTest {

  @Test
  public void test() {
    assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
    assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
  }


  @Test
  public void test_Seriously() {
    assertEquals("ylsuoireS", new SpinWords().spinWords("Seriously"));
  }

  @Test
  public void test_Hey_fellow_Warriors() {
    assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow Warriors"));
  }
  @Test
  public void test_This_is_a_test() {
    assertEquals("This is a test", new SpinWords().spinWords("This is a test"));
  }
  @Test
  public void test_This_is_Another_test() {
    assertEquals("This is rehtona test", new SpinWords().spinWords("This is Another test"));
  }
}
