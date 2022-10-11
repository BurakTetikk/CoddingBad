package Array_1;

import java.util.Arrays;

public class Exercise_08 {
    public static void main(String[] args) {
        /*
        Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
            maxEnd3([1, 2, 3]) → [3, 3, 3]
            maxEnd3([11, 5, 9]) → [11, 11, 11]
            maxEnd3([2, 11, 3]) → [3, 3, 3]
         */
        int[] arr = new int[3];
        creatArray(arr);
        System.out.println(Arrays.toString(arr));
        compareFirstAndLast(arr);
        System.out.println(Arrays.toString(compareFirstAndLast(arr)));
    }
    public static int[] compareFirstAndLast(int[] arr) {
        if (arr[0] > arr[2]){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[0];
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[2];
            }
        }
        return arr;
    }

    public static int[] creatArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
    }
}
