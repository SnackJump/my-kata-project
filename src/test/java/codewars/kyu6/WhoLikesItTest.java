package codewars.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhoLikesItTest {
    @Test
    void testNoUser(){
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
    }
    @Test
    void testOneUser(){
        assertEquals("Peter likes this", WhoLikesIt.whoLikesIt("Peter"));
    }

    @Test
    void testTwoUser(){
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
    }

    @Test
    void testThreeUser(){
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
    }

    @Test
    void testMoreThenThreeUser1(){
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

    @Test
    void testMoreThenThreeUser2(){
        assertEquals("Alex, Jacob and 3 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max",
                "Max3"));
    }

}