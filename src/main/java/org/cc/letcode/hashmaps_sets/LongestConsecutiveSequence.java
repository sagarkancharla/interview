package org.cc.letcode.hashmaps_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1)
                return i;
        }
        return 0;
    }

    public static int longestConsecutive1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currentStreak = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }
        return longestStreak;

    }

    public static void main(String[] args) {
        int ans = longestConsecutive1(new int[]{100, 4, 200, 1, 3, 2, 5});
        System.out.println(ans);
    }
}
