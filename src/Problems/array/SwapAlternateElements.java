package Problems.array;

import java.util.Arrays;

public class SwapAlternateElements {

    static void swapAlternateElements(int[] arr) {
        for (int i = 0; i + 1 < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        swapAlternateElements(arr);
        System.out.println(Arrays.toString(arr));  // [2, 1, 4, 3, 6, 5, 7]
    }
}