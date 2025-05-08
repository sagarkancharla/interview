package org.cc.interview;

public class SwitchExpressions {
    enum Day {
        Morning, Afternoon, Evening, Night
    }

    public static void main(String[] args) {

        Day day = Day.Afternoon;
        extracted(day);
    }

    private static void extracted(Day day) {
        int dayInt = switch (day) {
            case Morning -> {
                yield 0;
            }
            case Afternoon, Evening -> 1;
            case Night -> 2;
        };
        System.out.println(dayInt);
    }
}
