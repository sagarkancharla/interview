package org.cc.interview;

import java.util.Arrays;

public class MovingZerosToEnd {

    public static void moveZeros(int[] array) {
        int j = 0; //find zero ele position
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[j] == 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if (array[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] ints = {1, 0, 2, 0, 5, 0, 9, 11};
        moveZeros(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void moveZeros2(int[] arr) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
}
