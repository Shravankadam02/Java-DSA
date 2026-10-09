package Problems.array;

public class maxElementOfArray {

    static int findMax (int[] arr ){

        int size = arr.length;
        int max = arr[0];

        for (int i = 0; i < size; i++) {
            if (max < arr[i]){
                max = arr[i];
            }

        }
        return max;

    }

    public static void main(String[] args) {

        int[] arr = { 12,45,67,89,98,23,54};

        System.out.println(findMax(arr));
    }

}
