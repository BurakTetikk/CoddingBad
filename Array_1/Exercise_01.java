package Array_1;

import java.util.Arrays;

public class Exercise_01 {
    public static void main(String[] args) {
        /*
        Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false
         */
        int[] arr = new int[5];
        creatArr(arr);
        System.out.println(Arrays.toString(arr));
        firstLast(arr);
        System.out.println(firstLast(arr));
    }

    public static int creatArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return 1;
    }

    public static boolean firstLast(int[] arr) {
        if (arr[0] ==6 || arr[arr.length - 1] == 6){
            return true;
        }
        else {
            return false;
        }
    }
}
