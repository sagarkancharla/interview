package org.cc.letcode.arrays_strings;

public class FindClosestNumberToZero {

    public static int findClosestNumberToZero(int[] nums) {
        int closest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest) || num == Math.abs(closest))
                closest = num;
        }
        return closest;
    }

    public static void main(String[] args) {
        int closest = findClosestNumberToZero(new int[]{-1, -1, 1, 1});
        System.out.println(closest);
    }
}
