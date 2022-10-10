package Array_1;


import java.util.Arrays;

public class Exercise_02 {
    public static void main(String[] args) {
        /*
        Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
        sameFirstLast([1, 2, 3]) → false
        sameFirstLast([1, 2, 3, 1]) → true
        sameFirstLast([1, 2, 1]) → true
         */
        int length = (int)(Math.random() * 10);
        getNewValue(length);
        System.out.println("Array's length is : " + length);
        int[] arr = new int[length];
        creatArr(arr);
        System.out.println(Arrays.toString(arr));
        compareFirstAndLast(arr);
        System.out.println(compareFirstAndLast(arr));
    }

    public static int getNewValue(int length) {
        while(length == 0) {
            if (length == 0) {
                length = (int) (Math.random() * 10);
            }
        }
        return 1;
    }

    public static boolean compareFirstAndLast(int[] arr) {
        if (arr[0] == arr[arr.length - 1]){
            return true;
        }
        else {
            return false;
        }
    }

    public static int creatArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10);
        }
        return 1;
    }
}
