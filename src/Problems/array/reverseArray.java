package Problems.array;

public class reverseArray {

    static void getRevArray(int[] arr){
        int size = arr.length;
        int i = 0 ;
        int j = size-1;

        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k : arr){
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        getRevArray(arr);
    }
}
