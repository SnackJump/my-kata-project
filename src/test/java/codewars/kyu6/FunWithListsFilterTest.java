package codewars.kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.function.Predicate;

class FunWithListsFilterTest {


    // Helpers.testFilter(input_list_head, predicate, expected_list_head)

    @Test
    void testNulll() {
        Helpers.testFilter(null, __ -> false, null);
    }

    private static class Helpers {
        public static <T> void testFilter(FunWithListsFilter.Node<T> inputListHead,
                                          Predicate<T> predicate,
                                          FunWithListsFilter.Node<T> expectedListHead) {
            if (inputListHead == null) {
                Assertions.assertEquals(expectedListHead, FunWithListsFilter.filter(inputListHead, predicate));
            } else {
                Assertions.assertEquals(expectedListHead.toString(), FunWithListsFilter.filter(inputListHead, predicate).toString());
            }
        }
    }

    @Test
    void testCase2() {
        Helpers.testFilter(new FunWithListsFilter.Node<>(1,
                        new FunWithListsFilter.Node<>(2,
                                new FunWithListsFilter.Node<>(3))),
                x -> true,
                new FunWithListsFilter.Node<>(1,
                        new FunWithListsFilter.Node<>(2,
                                new FunWithListsFilter.Node<>(3))));
    }

    @Test
    void testCase3() {
        Helpers.testFilter(new FunWithListsFilter.Node<>(1, new FunWithListsFilter.Node<>(2, new FunWithListsFilter.Node<>(3))),
                x -> (x <= 2), new FunWithListsFilter.Node<>(1, new FunWithListsFilter.Node<>(2)));
    }

    @Test
    void testCase4() {

        Helpers.testFilter(new FunWithListsFilter.Node<>(1, new FunWithListsFilter.Node<>(2, new FunWithListsFilter.Node<>(3))), x -> x == 1, new FunWithListsFilter.Node<>(1));
    }
}