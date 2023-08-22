package codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunWithListsLengthTest {

    @Test
    void testNull() {
        assertEquals(0, FunWithListsLength.length(null));
    }

    @Test
    void test4() {
        assertEquals(4, FunWithListsLength.length(FunWithListsLength.Helpers.listFromArray(1, 2, 3, 4)));
    }

}