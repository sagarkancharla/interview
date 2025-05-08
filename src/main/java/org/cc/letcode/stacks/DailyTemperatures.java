package org.cc.letcode.stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperature) {
        int[] result = new int[temperature.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < temperature.length; i++) {
            while (!stack.isEmpty() && temperature[i] > temperature[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(ints));
    }
}
