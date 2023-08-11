package codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Title: SecretDetectiveTest<br>
 * Description:<br>
 * https://www.codewars.com/kata/53f40dff5f9d31b813000774/train/java<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/5
 */
class SecretDetectiveTest {
  private SecretDetective detective;

  @BeforeEach
  public void setup() {
    System.out.println("11");
    detective = new SecretDetective();
  }

  @Test
  public void secret1() {
    char[][] triplets = {
        {'t','u','p'},
        {'w','h','i'},
        {'t','s','u'},
        {'a','t','s'},
        {'h','a','p'},
        {'t','i','s'},
        {'w','h','s'}
    };
    assertEquals("whatisup", detective.recoverSecret(triplets));
  }
}
