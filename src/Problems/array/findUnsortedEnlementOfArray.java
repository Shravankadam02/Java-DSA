package Problems.array;

public class findUnsortedEnlementOfArray {

    static int findUnsortedElement(int[] arr){
        int unsortedElement;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,6,5,7,8};
        System.out.println(findUnsortedElement(arr));
    }

}
