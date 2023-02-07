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
}
