package org.cc.interview;

import java.util.stream.Stream;

public class FindGrade {

    public static String getGrade(Integer integer) {
        return switch (integer) {
            case Integer i when i >= 90 -> "A";
            case Integer i when i >= 80 -> "B";
            case Integer i when i >= 70 -> "C";
            case Integer i when i >= 60 -> logAndYield(i);
            case Integer i when i >= 50 -> "E";
            default -> "F";
        };
    }

    public static String logAndYield(int i) {
        System.out.printf("Grade is %d", i);
        return "D";
    }

    public static void main(String[] args) {
        Stream.of(30, 40, 50 , 60 ,70)
                .map(FindGrade::getGrade)
                .forEach(System.out::println);
    }
}
