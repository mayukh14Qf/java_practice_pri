package java_18_07;

import java.util.Scanner;

public class loop8 {
    public static void main(String[] args) {

        // Reverse a Given Number
        // input- 345 , output - 543
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your number : ");
        int number1=sc.nextInt();

        int reverse= 0;

        while (number1 >0 ){
            reverse=(reverse*10)+(number1%10);
            number1=number1/10;
        }

        System.out.println(reverse);



        // Palindrome check
        // input - 121 , reverse- output-> 121 (palindrome)

        System.out.println("Enter your number : ");
        int number2=sc.nextInt();

        int temp=number2;

        int reverse1= 0;

        while (number2 >0 ){
            reverse1=(reverse1*10)+(number2%10);
            number2=number2/10;
        }

        System.out.println(reverse1);
        System.out.println(number2);

        if (temp==reverse1){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }


        // find the max and min

        System.out.println(Math.max(45,78)); //78
        System.out.println(Math.min(34,101)); //34

        // Find the sqrt

        System.out.println(Math.sqrt(625)); //25

        // absolute value
        //it converts negative number into positive number
        System.out.println(Math.abs(-78)); //+78

        // Find out the power
        // First number should the number for which we need to find the power
        // the second number should be the value of the power
        System.out.println(Math.pow(8,4)); // 8^4
        System.out.println(Math.pow(9,4)); // 9^4




    }
}
