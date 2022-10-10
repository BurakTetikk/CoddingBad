package Array_1;


import java.util.Arrays;

public class Exercise_05 {
    public static void main(String[] args) {
        /*
        Given an array of ints length 3, return the sum of all the elements.
            sum3([1, 2, 3]) → 6
            sum3([5, 11, 2]) → 18
            sum3([7, 0, 0]) → 7
         */
        int length = (int)(Math.random() * 10 +1);
        int[] arr = new int[length];
        creatArray(arr, length);
        System.out.println(Arrays.toString(creatArray(arr, length)));
        sumArray(arr);
        System.out.println(sumArray(arr));
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] creatArray(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
    }
}
