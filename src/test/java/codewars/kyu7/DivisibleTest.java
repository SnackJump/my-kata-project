package codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleTest {
    @Test
    void test_3_3_4() {
        assertFalse(Divisible.isDivisible(3, 3, 4));
    }

    @Test
    void test_12_3_4() {
        assertTrue(Divisible.isDivisible(12, 3, 4));
    }

    @Test
    void test_8_3_4_2_5() {
        assertFalse(Divisible.isDivisible(8, 3, 4, 2, 5));
    }

}