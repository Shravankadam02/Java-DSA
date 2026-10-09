package Problems.array;

public class findSumOfPositveNegative {

    static int[] sumOfPosNeg(int[] arr){

        int positiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > 0){
                positiveSum += arr[i];
            }
            else {
                negativeSum += arr[i];
            }
        }

        int [] ans ={positiveSum , negativeSum};

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = { 2,-3,4,-5,6,-7,8,-9,10};

        int[] ans = sumOfPosNeg(arr);

        System.out.println("Sum of Positive numbers are " + ans[0]);
        System.out.println("Sum of negative numbers are " + ans[1]);

    }
}
