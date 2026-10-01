import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter Your Age");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("You are Eligible For Vote");
        }
        else{
            System.out.println("You are not Eligible for Vote");
        }
        */

        System.out.println("Enter Marks Of Physics :");
        int Physics = sc.nextInt();
        System.out.println("Enter Marks Of Chemistry :");
        int Chemistry = sc.nextInt();
        System.out.println("Enter Marks Of Maths :");
        int Maths = sc.nextInt();
        System.out.println("Enter Marks Of Biology :");
        int Biology = sc.nextInt();
        System.out.println("Enter Marks Of English :");
        int English = sc.nextInt();

        int totalMarks = English + Maths + Physics + Chemistry + Biology ;
        int least = Physics ;
        if(Maths < least){
            least = Maths;
        }
        if(Chemistry < least){
            least = Chemistry;
        }
        if(Biology < least){
            least = Biology;
        }
        if(English < least){
            least = English;
        }
        int tota4Percentage = totalMarks - least;

        float Percentage = ((tota4Percentage/400.0f)*100);
        System.out.println("Your Total Marks Is :" + totalMarks);
        System.out.println("Your Total Marks Is :" + tota4Percentage);
        System.out.println("Percentage :"+ Percentage+"%");

        sc.close();
    }
}
