package Problems.array;

public class shiftArrayElementby1position {

    static void getShiftedby1(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i <= n-1 ; i++) {
            if(i < n-1){
                ans[i+1] = arr[i];
            }
            else {
                ans[0] = arr[i];
            }
        }
        for (int k : ans){
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        getShiftedby1(arr);
    }
}
