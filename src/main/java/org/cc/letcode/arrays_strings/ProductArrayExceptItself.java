package org.cc.letcode.arrays_strings;

import java.util.Arrays;

public class ProductArrayExceptItself {

    public static int[] getProductArrayExceptItself(int[] arr) {

        int prefix = 1;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }
        int suffix = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = suffix * result[i];
            suffix *= arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] res = getProductArrayExceptItself(new int[]{6, 2, 5, 3, 4});
        System.out.println(Arrays.toString(res));
    }
}
