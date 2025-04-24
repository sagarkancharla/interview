package org.cc.letcode.two_pointer;

import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target)
                return new int[]{left + 1, right + 1};
            else if (numbers[left] + numbers[right] > target)
                right--;
            else
                left++;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] twoSum = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(twoSum));
    }
}
