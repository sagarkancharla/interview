package org.cc.letcode.hashmaps_sets;

import java.util.*;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ranChar = ransomNote.toCharArray();
        char[] magChar = magazine.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : magChar) {
            map.put(ch, map.getOrDefault(ch, 0));
        }

        for (char ch : ranChar) {
            if(!map.containsKey(ch) || map.get(ch) == 0)
                return false;
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if(--freq[ch - 'a'] < 0 )
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans = canConstruct2("aab", "ba");
        System.out.println(ans);
    }
}
