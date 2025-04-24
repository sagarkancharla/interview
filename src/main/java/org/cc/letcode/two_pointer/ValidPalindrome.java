package org.cc.letcode.two_pointer;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[\\W_]", "");
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {

        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans = isPalindrome2("A man, a plan, a canal: Panama");
        boolean ans1 = isPalindrome2("0p");
        System.out.println(ans);
        System.out.println(ans1);
    }
}
