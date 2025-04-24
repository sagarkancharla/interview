package org.cc.letcode.hashmaps_sets;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {
        char[] balloon = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        Map<Character, Integer> ballMap = new HashMap<>();
        for (char ch : balloon) {
            ballMap.put(ch, ballMap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> textMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            textMap.put(ch, textMap.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        boolean cond = true;
        while (cond) {
            for (char ch : balloon) {
                if (!textMap.containsKey(ch) || textMap.get(ch) == 0) {
                    cond = false;
                    break;
                }
                textMap.put(ch, textMap.get(ch) - 1);
            }
            count++;
        }
        return count - 1;
    }

    public static int maxNumberOfBalloons2(String text) {
        int[] count = new int[26];
        for(char ch: text.toCharArray()) {
            count[ch - 'a']++;
        }

        int b = count['b'-'a'];
        int a = count[0];
        int l = count['l' - 'a']/2;
        int o = count['o'-'a']/2;
        int n = count['n' - 'a'];

        return Math.min(Math.min(Math.min(b,a), Math.min(l,o)),n);
    }

    public static void main(String[] args) {
        int ans = maxNumberOfBalloons2("nlaebolko");
        System.out.println(ans);
    }

}
