package Array_1;

import java.util.Arrays;

public class Exercise_10 {
    public static void main(String[] args) {
        /*
        Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
            middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
            middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
            middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
         */
        int[] arr1 = new int[3];
        creatArray(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[3];
        creatArray(arr2);
        System.out.println(Arrays.toString(arr2));
        middleWay(arr1, arr2);
        System.out.println(Arrays.toString(middleWay(arr1, arr2)));
    }

    public static int[] middleWay(int[] arr1, int[] arr2) {
        int[] arr3 = new int[2];
        arr3[0] = arr1[1];
        arr3[1] = arr2[1];
        return arr3;
    }

    public static int[] creatArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
    }
}
