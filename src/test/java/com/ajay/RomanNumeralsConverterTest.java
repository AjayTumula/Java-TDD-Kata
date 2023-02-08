package com.ajay;

import org.ajay.IntegerNumberConverter;
import org.ajay.RomanNumeralsConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {

    @Test
    public void ConvertOneToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("I", romanNumeralsConverter.convert(1));
    }

    @Test
    public void ConvertTwoToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("II", romanNumeralsConverter.convert(2));
    }

    @Test
    public void ConvertThreeToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("III", romanNumeralsConverter.convert(3));
    }

    @Test
    public void ConvertFourToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("IV", romanNumeralsConverter.convert(4));
    }


    @Test
    public void ConvertThirtySixToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("XXXVI", romanNumeralsConverter.convert(36));
    }


    @Test
    public void ConvertFiftyFourToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("LIV", romanNumeralsConverter.convert(54));
    }

    @Test
    public void ConvertOneTwentyFiveToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("CXXV",romanNumeralsConverter.convert(125));
    }

    @Test
    public void ConvertFiveFiftySixToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("DLVI",romanNumeralsConverter.convert(556));
    }

    @Test
    public void ConvertOneThousandFifteenToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("MXV",romanNumeralsConverter.convert(1015));
    }


    //Converting the Roman Numerals to Integers
    @Test
    public void ConvertRomanNumberOneToNumber() {
        IntegerNumberConverter integerNumberConverter = new IntegerNumberConverter();

        assertEquals(1,integerNumberConverter.convert("I"));
    }

    //Negative test cases
    @Test
    public void ConvertZeroToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("Not a roman numeral",romanNumeralsConverter.convert(0));
    }

    @Test
    public void ConvertThreeThousandOneHundredToNumeral() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals("Not a roman numeral",romanNumeralsConverter.convert(0));
    }
}
