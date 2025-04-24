package org.cc.interview;

public class QuestionsOnString {

    public static void main(String[] args) {
        String s1 = "100";
        Integer num = 100;
        String s2 = num.toString();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
