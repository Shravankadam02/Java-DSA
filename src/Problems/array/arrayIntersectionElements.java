
package Problems.array;

import java.util.Arrays;

public class arrayIntersectionElements {

    static int[] getIntersectionArr(int[] arr1, int[] arr2) {

        int[] ans = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    ans[index] = arr1[i];
                    index++;
                    break;
                }
            }
        }

        return Arrays.copyOf(ans, index);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8};

        int[] ans = getIntersectionArr(arr1, arr2);

        for (int element : ans) {
            System.out.println(element);
        }
    }
}