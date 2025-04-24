package org.cc.letcode.hashmaps_sets;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        if(s.length() != t.length())
            return false;
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            if(--freq[ch - 'a'] < 0 )
                return false;
        }
        return true;
    }
}
