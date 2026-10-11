package Problems.array;

public class sort0s1s {

    static int[] getSort(int[] arr){
        int n = arr.length;
        int i = 0;
        int j =n-1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else if (arr[i] == 0) {
                i++;
            } else {
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,0,1};
        int[] ans = getSort(arr);
        for (int k : ans){
            System.out.println(k);
        }
    }
}
