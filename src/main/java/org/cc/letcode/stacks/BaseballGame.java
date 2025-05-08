package org.cc.letcode.stacks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BaseballGame {
    public static int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    int res = a + b;
                    stack.push(b);
                    stack.push(a);
                    stack.push(res);
                }
                case "D" -> stack.push(2 * stack.peek());
                case "C" -> stack.pop();
                default -> stack.push(Integer.parseInt(operation));
            }
        }
        int res = 0;
        for (int i : stack) {
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        int points = calPoints(new String[]{"1","C","-62","-45","-68"}); // 27
        System.out.println(points);
    }
}
