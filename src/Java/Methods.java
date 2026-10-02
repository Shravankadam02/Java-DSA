public class Methods {
//    static int add(int a,int b){
//     int sum = a+b;
//     return sum;
//    }

    static void isEven(int num){
        if(num % 2 == 0 && num >= 2){
            System.out.println("The Given Number Is Even");
        }
        else{
            System.out.println("The Given Number Is Not Even Number");
        }
    }

    public static void main(String[] args) {
//        int result = add(12,12);
//        System.out.println(result);
        isEven(11);
    }
}
