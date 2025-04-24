package org.cc.letcode.hashmaps_sets;

import java.util.*;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char ch : jewels.toCharArray()) {
            jewelSet.add(ch);
        }
        int count = 0;
        for (char ch : stones.toCharArray()) {
            if(jewelSet.contains(ch))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int ans = numJewelsInStones("aA", "aAAbbbb");
        System.out.println(ans);
    }
}

