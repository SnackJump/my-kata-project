package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalTimeConversionTest {

    @Test
    void testToIndustrial_Int_1() {
        assertEquals(0.02, DecimalTimeConversion.toIndustrial(1));
    }

    @Test
    void testToIndustrial_Int_2() {
        assertEquals(0.03, DecimalTimeConversion.toIndustrial(2));
    }

    @Test
    void testToIndustrial_Int_105() {
        assertEquals(1.75, DecimalTimeConversion.toIndustrial(105));
    }


    @Test
    void testToIndustrial_String_0_03() {
        assertEquals(0.05, DecimalTimeConversion.toIndustrial("0:03"));
    }

    @Test
    void testToIndustrial_String_0_04() {
        assertEquals(0.07, DecimalTimeConversion.toIndustrial("0:04"));
    }

    @Test
    void testToIndustrial_String_1_45() {
        assertEquals(1.75, DecimalTimeConversion.toIndustrial("1:45"));
    }

    @Test
    void testToNormal_1_75() {
        assertEquals("1:45", DecimalTimeConversion.toNormal(1.75));
    }

    @Test
    void testToNormal_0_33() {
        assertEquals("0:20", DecimalTimeConversion.toNormal(0.33));
    }

    @Test
    void testToNormal_15_13() {
        assertEquals("15:08", DecimalTimeConversion.toNormal(15.13));
    }
}