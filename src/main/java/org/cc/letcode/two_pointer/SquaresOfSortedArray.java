package org.cc.letcode.two_pointer;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        int left = 0, right = length - 1, pos = length - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                ans[pos--] = leftSquare;
                left++;
            } else {
                ans[pos--] = rightSquare;
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = sortedSquares(new int[]{-4, -1, 0, 3, 10});
        System.out.println(Arrays.toString(ans));
    }
}
