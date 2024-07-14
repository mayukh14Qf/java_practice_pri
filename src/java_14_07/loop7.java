package java_14_07;

import java.util.Scanner;

public class loop7 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        // (1) print Every Digit of A Number
        // 23546 -> output, 2,3,5,4,6

        System.out.println("Enter your Number : ");
        int num1=sc.nextInt();

        while (num1>0){
            System.out.println(num1%10);
            num1=num1/10;
        }

        // (2) print sum of the Every Digit of A Number
        // 23546 -> output, 2+3+5+4+6=20

        System.out.println("Enter Your Number : ");
        int number1=sc.nextInt();

        int sumOfDigits=0;
        while (number1>0){
            sumOfDigits=sumOfDigits+(number1%10);
            number1=number1/10;
        }
        System.out.println("Sum of the digits are :"+sumOfDigits);


        // Fibonacci Series
        // 0 1 1 2 3 5 8 13 .......


        System.out.println("Enter your Range or position : ");
        int position=sc.nextInt();

        int first=0;
        int Second=1;

        System.out.println(first);
        System.out.println(Second);

        for (int i=3; i<=position;i++){
            int third=first+Second;
            System.out.println(third);
            first=Second; // changing my first
            Second=third; //changing my second
        }

    }
}
