package codewars.kyu8;

import codewars.Maskify;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {
    @Test
    void test_Jim() {
        assertEquals("Hello, Jim!", Greeter.greet("Jim"), "should greet some people normally");
    }

    @Test
    void test_Jane() {
        assertEquals("Hello, Jane!", Greeter.greet("Jane"), "should greet some people normally");
    }

    @Test
    void test_Simon() {
        assertEquals("Hello, Simon!", Greeter.greet("Simon"), "should greet some people normally");
    }

    @Test
    void test_Johnny() {
        assertEquals("Hello, my love!", Greeter.greet("Johnny"), "should greet Johnny a little bit more special");
    }

}