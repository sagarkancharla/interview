package org.cc.letcode.stacks;

import java.util.ArrayDeque;

public class ValidParentheses {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[')
                stack.push(ch);
            else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == '}' && top != '}')
                        || (ch == ']' && top != '[')
                        || (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
