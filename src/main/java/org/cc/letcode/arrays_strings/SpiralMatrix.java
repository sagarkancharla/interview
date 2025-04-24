package org.cc.letcode.arrays_strings;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return result;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            //left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            //for rectangular matrix with n > m or m > n
            if (top > bottom || left > right) {
                break;
            }
            //right to left

            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;


            //bottom to top

            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;


        }
        return result;
    }

    public static List<Integer> spiralOrder2(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return ans;
        int[][] directions = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int m = matrix.length, n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        int r = 0, c = 0;
        int d = 0;
        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[r][c]);
            visited[r][c] = true;
            int nextR = r + directions[d][0];
            int nextC = c + directions[d][1];
            if(nextR >= 0 && nextR < m && nextC >= 0 && nextC < n && !visited[nextR][nextC]){
                r = nextR;
                c = nextC;
            }else{
                d = (d + 1) % 4;
                r += directions[d][0];
                c += directions[d][1];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        List<Integer> integers = spiralOrder(new int[][]{{1, 2, 3, 1}, {4, 5, 6, 2}, {7, 8, 9, 3}});
        List<Integer> integers2 = spiralOrder2(new int[][]{{1, 2, 3, 1}, {4, 5, 6, 2}, {7, 8, 9, 3}});
        System.out.println(integers);
        System.out.println(integers2);
    }
}
