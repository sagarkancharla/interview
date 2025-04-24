package org.cc.letcode.two_pointer;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int area = (right - left) * (Math.min(height[left], height[right]));
            maxArea = Math.max(area, maxArea);

            if(height[right] > height[left])
                left++;
            else
                right--;

        }
        return maxArea;
    }

    public static int maxArea2(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            max = Math.max(max, h * (r - l));
            while (l < r && height[l] <= h) {
                l++;
            }
            while (l < r && height[r] <= h) {
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int maxArea = maxArea2(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        System.out.println(maxArea);
    }

}
