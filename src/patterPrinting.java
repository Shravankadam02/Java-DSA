public class patterPrinting {
    public static void main(String[] args) {

//        int n =5;
//
//        for(int row = 1;row <= n ;row++){
//            for(int spc = 1;spc<=n-row;spc++){
//                System.out.print("  ");
//            }
//            for(int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Part - 1
        int n = 4;
        for(int row = 1;row<=n;row++){
            for(int sp = 1;sp <= row-1;sp++){
                System.out.print("  ");
            }

            for(int col = 1; col <= 2*(n-row)+1 ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Part 2
        for(int row = 1; row <=n;row++){
            if(row == 1){
                continue;
            }
            for(int sp = 1;sp<= n-row;sp++){
                System.out.print("  ");
            }
            for(int col =1;col<=2*row-1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
