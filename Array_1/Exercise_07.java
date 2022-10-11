package Array_1;

import java.util.Arrays;

public class Exercise_07 {
    public static void main(String[] args) {
        /*
        Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
            reverse3([1, 2, 3]) → [3, 2, 1]
            reverse3([5, 11, 9]) → [9, 11, 5]
            reverse3([7, 0, 0]) → [0, 0, 7]
         */
        int[] arr = new int[3];
        creatArray(arr);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] arr) {
        int[] arr1 = new int[3];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arr1[i] = arr[j];
        }
        return arr1;
    }

    public static int[] creatArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
    }
}
