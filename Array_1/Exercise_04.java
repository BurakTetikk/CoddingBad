package Array_1;

import java.util.Arrays;

public class Exercise_04 {
    public static void main(String[] args) {
        /*
        Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
            commonEnd([1, 2, 3], [7, 3]) → true
            commonEnd([1, 2, 3], [7, 3, 2]) → false
            commonEnd([1, 2, 3], [1, 3]) → true
         */
        int length1 = (int) (Math.random() * 10 +1);
        int length2 = (int) (Math.random() * 10 + 1);
        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];
        creatArray1(length1, arr1);
        creatArray2(length2, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        compareArrays(arr1, arr2);
        System.out.println(compareArrays(arr1, arr2));
    }

    public static boolean compareArrays(int[] arr1, int[] arr2 ) {
        if (arr1[0] == arr2[0] || arr1[arr1.length - 1] == arr2[arr2.length - 1]) {
            return true;

        } else {
            return false;
        }
    }

    public static int[] creatArray2(int length, int[] arr) {
        for (int i = 0; i < length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return arr;
    }

    public static int[] creatArray1(int length, int[] arr) {
        for (int i = 0; i < length; i++) {
            arr [i] = (int)(Math.random() * 10);
        }
        return arr;
    }
}
