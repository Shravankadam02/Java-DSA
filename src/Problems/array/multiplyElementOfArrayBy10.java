package Problems.array;

public class multiplyElementOfArrayBy10 {

    static int[] muliplyBy10(int[] arr){

        int size = arr.length;

        int newArray[] = new int[size];

        for (int i = 0; i < size; i++) {

            int element = arr[i];
            int newElement = element * 10 ;
            newArray[i] = newElement;

        }
        return newArray;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int ans[] = muliplyBy10(arr);

        for( int i : ans){
            System.out.println( i + " ");
        }
    }

}
