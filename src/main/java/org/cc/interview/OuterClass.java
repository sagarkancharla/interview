package org.cc.interview;

public class OuterClass {

    private int num1;
    private static int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    private static  void getNum2() {
        System.out.println(num2);
    }

    class InnerClass {

        private int num3;
        private static int num4;

        public void setNum3(int num3) {
            this.num3 = num3;
        }

        public int getNum3() {
            return num3;
        }

        private static void getNum4() {
            System.out.println(num4);
        }

    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        OuterClass.InnerClass.getNum4();
        OuterClass.getNum2();
    }
}
