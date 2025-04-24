package org.cc.letcode.arrays_strings;

public class IsSubsequence {

    public static boolean isSubsequence(String sub, String input) {

        int i=0,j=0;
        while (i < input.length() && j < sub.length()) {
            if(input.charAt(i) == sub.charAt(j)) {
                j++;
            }
            i++;
            if(j == sub.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean res = isSubsequence("axc", "ahbgdc");
        System.out.println(res);
    }
}
