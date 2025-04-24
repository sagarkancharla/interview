package org.cc.letcode.arrays_strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length -1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if(first[i] != last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
}
