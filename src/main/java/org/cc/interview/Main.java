package org.cc.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent parentRef = new Child();

        parent.show();
        child.show();
        parentRef.show();

        parentRef.parentMethod();
        child.parentMethod();
        child.childMethod();


        List<?> list = new LinkedList<String>();
        //list.add("sagar"); cannot add read only

        List<Object> objects = new ArrayList<>();
        objects.add("sagar");
        Object o = objects.get(0);
        System.out.println(o);

        List<? super Number> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        Object o1 = nums.get(0);

        List<? extends Integer> ints = new ArrayList<>();
        // ints.add(1);  cannot add read only
    }
}
