package Array_1;

import java.util.Arrays;

public class Exercise_09 {
    public static void main(String[] args) {
        /*
        Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
            sum2([1, 2, 3]) → 3
            sum2([1, 1]) → 2
            sum2([1, 1, 1, 1]) → 2

         */
        int length = (int)(Math.random() * 10 + 1);
        int[] arr = new int[length];
        creatArray(arr);
        System.out.println(Arrays.toString(arr));
        sumArray(arr);
        System.out.println(sumArray(arr));
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] creatArray(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random() * 10);
        }
            return arr;
    }
}
