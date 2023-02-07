package com.ajay;

import org.ajay.RomanNumeralsConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    @Test
    public void ConvertOneToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("I",romanNumeralsConverter.convert(1));
    }

    @Test
    public void ConvertTwoToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("II",romanNumeralsConverter.convert(2));
    }

    @Test
    public void ConvertThreeToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("III",romanNumeralsConverter.convert(3));
    }


}
