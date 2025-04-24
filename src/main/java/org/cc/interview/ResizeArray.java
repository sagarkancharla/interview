package org.cc.interview;

public class ResizeArray {

    public static int[] resize(int[] arr, int size) {
        int[] temp = new int[size];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        return temp;
    }

    public static void main(String[] args) {
        int[] resized = resize(new int[]{1, 2, 3, 4}, 8);
    }
}
