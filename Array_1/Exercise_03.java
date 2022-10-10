package Array_1;

import java.util.Arrays;

public class Exercise_03 {
    /*
    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
     */
    public static void main(String[] args) {
        creatArray();
        System.out.println(Arrays.toString(creatArray()));
    }

    public static int[] creatArray() {
        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 4;
        return arr;
    }
}
