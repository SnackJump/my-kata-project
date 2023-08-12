package codewars.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Title: codewars.ASumTest<br>
 * Description:<br>
 *
 * @author 2920
 * @version 修訂記錄:<br>
 * @since 2022/7/2
 */
public class ASumTest {

    @Test
    public void test_1() {
        assertEquals(1, ASum.findNb(1L));
    }

    @Test
    public void test_9() {
        assertEquals(2, ASum.findNb(9L));
    }

    @Test
    public void test_10() {
        assertEquals(-1, ASum.findNb(10L));
    }

    @Test
    public void test1() {
        assertEquals(2022, ASum.findNb(4183059834009L));
    }

    @Test
    public void test2() {
        assertEquals(-1, ASum.findNb(24723578342962L));
    }

    @Test
    public void test3() {
        assertEquals(4824, ASum.findNb(135440716410000L));
    }

    @Test
    public void test4() {
        assertEquals(3568, ASum.findNb(40539911473216L));
    }

    @Test
    public void test_max() {
        assertEquals(55100, ASum.findNb(2304422822859502500L));
    }
}
