package org.cc.letcode.stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGraterElement {

    public static int[] nextGreaterElement(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = nums[i];
            }
            stack.push(i);
        }
        return res;
    }

    public static int[] nextSmallerElement(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[i] < nums[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = nums[i];
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ints = nextGreaterElement(new int[]{2, 9, 3, 2, 1, 10});
        System.out.println(Arrays.toString(ints));
        int[] ints1 = nextSmallerElement(new int[]{2, 9, 3, 2, 1, 10});
        System.out.println(Arrays.toString(ints1));
    }
}
