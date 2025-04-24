package org.cc.letcode.two_pointer;

import java.util.Arrays;

public class StringReverse {
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'s', 'a', 'g', 'a', 'r'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
