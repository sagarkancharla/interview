package org.cc.letcode.arrays_strings;

import java.util.Arrays;

public class RotateImage {

    // 1 2 3
    // 4 5 6
    // 7 8 9


    // 1 4 7
    // 2 5 8
    // 3 6 9

    // 7 4 1
    // 8 5 2
    // 9 6 3

    // 00 01 02
    // 10 11 12
    // 20 21 22

    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverseRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
       int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        transpose(matrix);
        reverseRow(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

}