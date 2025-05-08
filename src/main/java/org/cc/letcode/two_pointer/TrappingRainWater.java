package org.cc.letcode.two_pointer;

public class TrappingRainWater {

    public static int trap(int[] height) {
        int left = 0, right = height.length -1;
        int max_left = Integer.MIN_VALUE, max_right = Integer.MIN_VALUE;
        int water = 0;
        while (left < right) {
            if(height[left] > height[right]) {
                if (height[right] > max_right)
                    max_right = height[right];
                else
                    water += max_right - height[right];
            right --;
            } else {
                if(height[left] > max_left)
                    max_left = height[left];
                else
                    water += max_left - height[left];
            left++;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int trap = trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
        System.out.println(trap);
        int trap1 = trap(new int[]{4, 2, 0, 3, 2, 5});
        System.out.println(trap1);
    }
}
