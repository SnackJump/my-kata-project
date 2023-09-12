package codewars.kyu5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    @Test
    void testPig(){
        assertEquals("igPay", PigLatin.pigIt("Pig"));
    }
    @Test
    void testWordCase1(){
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
    }
    @Test
    void testWordCase2(){
    assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
    @Test
    void testOneChar(){
        assertEquals("oay", PigLatin.pigIt("o"));
    }
    @Test
    void testWithPunctuation(){
        assertEquals("elloHay orldway !", PigLatin.pigIt("Hello world !"));
    }

}