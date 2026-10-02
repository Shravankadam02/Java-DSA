public class BasicMaths {

    static int revNum(int num) {
        int reverseNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num = num / 10;
        }
        return reverseNum;
    }

    static void isPallindrome(int num){
        int revNum =revNum(num);
        System.out.println(revNum + " is a reverse number");
        if(num == revNum){
            System.out.println(num + " is Pallindrome Number");
        }
        else{
            System.out.println(num + " is not a Pallindrome Number");
        }
    }

    public static void main(String[] args) {
        int num = 1234;
        isPallindrome(num);
    }
}
