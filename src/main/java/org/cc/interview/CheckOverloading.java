package org.cc.interview;

public class CheckOverloading {

    public void m1(int i) {
        System.out.println("int arg");
    }

    public void m1(float f) {
        System.out.println("float arg");
    }

    public static void main(String[] args) {
        CheckOverloading check = new CheckOverloading();
        check.m1(10);
        check.m1(10.5F);
        check.m1('a');
        check.m1(10L);
        //check.m1(10.5D);
    }
}
