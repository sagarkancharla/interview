package org.cc.letcode.arrays_strings;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder result = new StringBuilder();

        int i=0;

        while(i < word1.length() || i < word2.length()) {
            if(i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    public static String sol2(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int n = Math.min(word1.length(), word2.length());

        for(int i = 0; i <= n-1; i++){
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }

        if(word1.length() != word2.length()) {
            String refStr = word1.length() > word2.length() ? word1 : word2;
            String subString = refStr.substring(n);
            str.append(subString);
        }
        return str.toString();

    }

    public static void main(String[] args) {
        String result = mergeAlternately("abcpk", "xyz");
        String sol2 = sol2("abc", "xyzpk");
        System.out.println(result);
        System.out.println(sol2);
    }
}
