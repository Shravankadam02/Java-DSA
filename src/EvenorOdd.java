import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {

        System.out.println("Enter a number");

        Scanner sc =new Scanner(System.in);

        int n=sc.nextInt();

      /*  if(n%2==0){
            System.out.println("The number " + n +" is even number");
        }
        else {
            System.out.println("The number " + n +" is odd number");
        }
        */

        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
}
