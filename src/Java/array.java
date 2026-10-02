import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=arr.length - 1;i++){
            for (int j=0;j<=arr[i].length - 1 ;j++){
                System.out.println("Enter the value for " + i + " row and " + j + " col");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<=arr.length - 1;i++){
            for (int j=0;j<=arr[i].length - 1 ;j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }

        int min = arr[0][0];

        for(int i=0;i<=arr.length - 1;i++){
            for (int j=0;j<=arr[i].length - 1 ;j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }

        }

        System.out.println("min value is :" + min);

    }
}
