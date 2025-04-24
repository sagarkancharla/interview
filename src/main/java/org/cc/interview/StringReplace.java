package org.cc.interview;

public class StringReplace {

    public static void main(String[] args) {
        String ex = "<% String eid = request.getParameter(\"eid\"); %>";
        String replaced = ex.replaceAll("[^a-zA-Z0-9_\\-]", "");
        System.out.println(replaced);
    }
}
