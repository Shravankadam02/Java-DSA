package Problems.array;

public class LinearSearch {

    static boolean findTarget(int [] arr , int target){
        int size = arr.length;
        for (int i = 0; i < size ; i++) {

            if(arr[i] == target){

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12,13,14,15};

        int target = 18;

        System.out.println(findTarget(arr,target));


    }

}
