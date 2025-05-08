package org.cc.letcode.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvalRPN {

    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    stack.push( stack.pop() + stack.pop());
                }
                case "-" -> {
                    stack.push(-stack.pop() + stack.pop());
                }
                case "/" -> {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                }
                case "*" -> {
                    stack.push(stack.pop() * stack.pop());
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        int evaled = evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"});
        System.out.println(evaled);
    }
}
