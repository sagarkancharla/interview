package org.cc.letcode.arrays_strings;

import java.util.Map;

public class RomanToInt {
    private static Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public static int romanToInt(String s) {

        char[] romans = s.toCharArray();
        int prevResult = 0;

        for (int i = romans.length - 1; i >= 0; i--) {
            int currResult;
            char roman = romans[i];
            if(map.get(roman) > prevResult) {
                currResult = prevResult + map.get(roman);
            } else {
                currResult = prevResult - map.get(roman);
            }
            prevResult = currResult;

        }

        return prevResult;
    }

    public static void main(String[] args) {
        int res = romanToInt("MCMXCIV");
        System.out.println(res);
    }
}
