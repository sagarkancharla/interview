package org.cc.interview;

import java.util.LinkedList;
import java.util.List;

public class Child extends Parent{
    @Override
    public void show() {
        System.out.println("child show");

    }

    public void childMethod() {
        System.out.println("child method");
    }
}
