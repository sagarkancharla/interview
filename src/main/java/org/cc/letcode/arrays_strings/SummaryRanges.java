package org.cc.letcode.arrays_strings;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        if (nums.length == 0)
            return new ArrayList<>();
        List<String> result = new ArrayList<>();

        int start = 0;

        for (int end = 1; end <= nums.length; end++) {
            if (end == nums.length || nums[end] != nums[end - 1] + 1) {
                if (start == end - 1) {
                    result.add(String.valueOf(nums[start]));
                } else {
                    result.add(String.format("%d->%d", nums[start], nums[end - 1]));
                }
                start = end;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> res = summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});
        System.out.println(res);
    }
}
