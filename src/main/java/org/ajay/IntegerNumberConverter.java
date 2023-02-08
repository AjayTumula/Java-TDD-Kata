package org.ajay;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerNumberConverter {
    public int convert(String romanNum) {
        Map<Character, Integer> values = new LinkedHashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int num = 0;
        for (int i = 0; i < romanNum.length(); i++) {
            if (i+1 == romanNum.length() || values.get(romanNum.charAt(i)) >= values.get(romanNum.charAt(i + 1))) {
                num += values.get(romanNum.charAt(i));
            } else {
                num -= values.get(romanNum.charAt(i));
            }
        }
        return num;
    }
}
