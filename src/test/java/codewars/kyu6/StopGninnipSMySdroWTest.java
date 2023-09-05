package codewars.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Title: StopGninnipSMySdroWTest<br>
 * Description:<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/2
 */
class StopGninnipSMySdroWTest {

    @Test
    void test() {
        assertEquals("emocleW", new StopGninnipSMySdroW().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new StopGninnipSMySdroW().spinWords("Hey fellow warriors"));
    }


    @Test
    void test_Seriously() {
        assertEquals("ylsuoireS", new StopGninnipSMySdroW().spinWords("Seriously"));
    }

    @Test
    void test_Hey_fellow_Warriors() {
        assertEquals("Hey wollef sroirraw", new StopGninnipSMySdroW().spinWords("Hey fellow warriors"));
    }

    @Test
    void test_This_is_a_test() {
        assertEquals("This is a test", new StopGninnipSMySdroW().spinWords("This is a test"));
    }

    @Test
    void test_This_is_Another_test() {
        assertEquals("This is rehtona test", new StopGninnipSMySdroW().spinWords("This is another test"));
    }

    @Test
    void test_Seriously_this_is_the_last_one() {
        assertEquals("ylsuoireS this is the last one", new StopGninnipSMySdroW().spinWords("Seriously this is the last one"));
    }


}
