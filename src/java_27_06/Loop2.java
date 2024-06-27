package java_27_06;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        Print 1st 10 natural numbers (INTEGER)

        for (int i=1; i<=10 ; i++ ){
            System.out.println(i);
        }


//        Print 1st 10 natural numbers In Reverse Order (INTEGER)

        for (int i=10; i>=1 ; i--){
            System.out.println(i);
        }


//        print all the even numbers in the range of (1-30)

        for (int i=1 ; i<=30; i++){
           if (i%2==0){
               System.out.println(i);
           }
        }
//  OR
        for (int i=2; i<=30 ; i=i+2){
            System.out.println(i);
        }


//        print all the odd numbers in the range of (1-30)


        for (int i=1; i<=30 ; i=i+2){
            System.out.println(i);
        }

//       Print sum of the 1st 10 natural Numbers
//        10+9+8+7+6+5+4+2+1=55

        int result=0;

        for (int i=1; i<=10 ; i++){
            result= result+i;
            System.out.println("for "+i+" result = "+result);
        }

        System.out.println(result);

//        Or

//        Formula for n natural number (n*(n+1))/2

        System.out.println("Enter your range :");
        int range=sc.nextInt();


        int result1=(range*(range+1))/2;

        System.out.println("your sum of the numbers is "+result1);


    }
}
