package org.cc.letcode.arrays_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        LinkedList<int[]> res = new LinkedList<>();
        if (intervals.length <= 1) return intervals;
        for (int[] interval : intervals) {
            if (res.isEmpty() || res.getLast()[1] < interval[0]) {
                res.add(interval);
            } else {
                res.getLast()[1] = Math.max(interval[1], res.getLast()[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static int[][] merge2(int[][] intervals) {
        if (intervals.length == 0) return new int[][]{};
        ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);
            } else {
                res.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[]{start, end});
        return res.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
        int[][] res = merge2(new int[][]{{1, 4}, {0, 2}, {3, 5}});
        System.out.println(Arrays.deepToString(res));
        int[][] res1 = merge2(new int[][]{{1, 10}, {2, 4}, {6, 8}});
        System.out.println(Arrays.deepToString(res1));
    }
}
