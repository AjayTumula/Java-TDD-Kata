package org.ajay;

public class RomanNumeralsConverter {

    public String convert(int arabicNumber) {
        String result = "";
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC","L", "XL","X", "IX", "V", "IV", "I"};
        if(arabicNumber == 0 || arabicNumber > 3000){
            result = "Not a roman numeral";
        }
        else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                while (arabicNumber >= values[i]) {
                    arabicNumber -= values[i];
                    sb.append(romanNumerals[i]);
                }
            }
            result = sb.toString();
        }
        return result;
    }

}
