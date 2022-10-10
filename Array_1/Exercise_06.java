package Array_1;

import java.util.Arrays;

public class Exercise_06 {
    public static void main(String[] args) {
        /*
        Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
            rotateLeft3([1, 2, 3]) → [2, 3, 1]
            rotateLeft3([5, 11, 9]) → [11, 9, 5]
            rotateLeft3([7, 0, 0]) → [0, 0, 7]
         */
        int[] arr = new int[3];
        creatArray(arr);
        System.out.println(Arrays.toString(creatArray(arr)));
        rotateLeft(arr);
        System.out.println(Arrays.toString(rotateLeft(arr)));
    }

    public static int[] rotateLeft(int[] arr) {
        int temp = arr[2];
        arr[2] = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
        return arr;
    }

    public static int[] creatArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
    }
}
