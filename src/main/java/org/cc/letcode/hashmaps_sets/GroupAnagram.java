package org.cc.letcode.hashmaps_sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {

    static String getSortedKey(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        /*Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }*/

        Map<String, List<String>> map = Arrays.stream(strs)
                .collect(Collectors.groupingBy(GroupAnagram::getSortedKey));
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        List<List<String>> ans
                = groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println(ans);
    }
}
