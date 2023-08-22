package codewars.kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunWithListsIndexOfTest {
    @Test
    void testCase1(){
        assertEquals(-1, FunWithListsIndexOf.indexOf(null, 17));
    }
    @Test
    void testCase2(){
        assertEquals(1, FunWithListsIndexOf.indexOf(FunWithListsIndexOf.Helpers.listFromArray(1, 2, 3), 2));
    }
    @Test
    void testCase3(){
        assertEquals(0, FunWithListsIndexOf.indexOf(FunWithListsIndexOf.Helpers.listFromArray("aaa", "b", "abc"), "aaa"));
    }
    @Test
    void testCase4(){
        assertEquals(0, FunWithListsIndexOf.indexOf(FunWithListsIndexOf.Helpers.listFromArray(17, "17", 1.2), 17));
    }
    @Test
    void testCase5(){
        assertEquals(1, FunWithListsIndexOf.indexOf(FunWithListsIndexOf.Helpers.listFromArray(17, "17", 1.2), "17"));
    }

    @Test
    void testCase6(){
        assertEquals(2, FunWithListsIndexOf.indexOf(FunWithListsIndexOf.Helpers.listFromArray(1, 2, 3, 3), 3));
    }

}