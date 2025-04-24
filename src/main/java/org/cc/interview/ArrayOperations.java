package org.cc.interview;

public class ArrayOperations {

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new int[]{2, 3, 4, 5});
        printArray(removeEvenInts(new int[]{1, 2, 3, 4, 6, 8, 9}));
        printArray(reverse(new int[]{2, 3, 4, 5, 6, 7}, 0, 5));
        System.out.println("second max: " + findSecondMax(new int[]{2, 3, 9, 5, 9, 7}));
        printArray(moveAllZerosToEnd(new int[]{0, 0, 0, 2, 1, 0, 3}));
        System.out.println(isPalindrome("madam"));
    }

    //return array with even integers removed
    public static int[] removeEvenInts(int[] input) {
        int oddLength = 0;
        for (int i : input) {
            if (i % 2 != 0) {
                oddLength++;
            }
        }

        int[] result = new int[oddLength];
        int j = 0;
        for (int k : input) {
            if (k % 2 != 0) {
                result[j] = k;
                j++;
            }
        }

        return result;
    }

    public static int[] reverse(int[] input, int start, int end) {
        while (start < end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }

    public static int findMinimum(int[] arr) {

        int min = 0;

        for (int ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }

    public static int findSecondMax(int[] arr) {
        int max = 0, secMax = 0;
        for (int ele : arr) {
            if (ele > max) {
                secMax = max;
                max = ele;
            } else if (ele > secMax && ele != max) {
                secMax = ele;
            }
        }

        return secMax;
    }

    public static int[] moveAllZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

    public static int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];

        System.arraycopy(arr, 0, temp, 0, arr.length);

        return temp;
    }

    public static int findMissingNum(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public static boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
