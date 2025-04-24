package org.cc.interview;

public class MaxAvgSubArray {

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        double maxAverage = findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        System.out.println(maxAverage);
    }
}
