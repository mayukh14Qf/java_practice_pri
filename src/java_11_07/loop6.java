package java_11_07;

import java.util.Scanner;

public class loop6 {
    public static void main(String[] args) {

        // (1)Find the numbers in between 25-700 those
        // divisible by 13

        Scanner sc=new Scanner(System.in);

        for (int i=25; i<=700 ; i++){
            if (i%13==0){
                System.out.println(i);
            }
        }

        // (2)Find the Factor Of A Number
        // n!=1*2*3*4*.....n or n*(n-1)*(n-2)*....1
        // 4!=1*2*3*4

        System.out.println("Enter your Number : ");
        int n=sc.nextInt();

        int result=1;

        for (int i=1; i<=n ;i++){
            result=result*i;
        }

        System.out.println(result);


        // (3)count No. Of Digits of A Number
        // 23546 -> output(5)
        // 245 -> output(3)

        System.out.println("Enter Your Number : ");
        int number1=sc.nextInt();

        int count=0;
        while (number1>0){
            count++;
            number1=number1/10;
        }

        System.out.println("NO. Of Digits are :"+count);


        // (4)Find the 1st digit of a number
        // 23546 -> output(2)
        // 945 -> output(9)


        System.out.println("Enter Your Number : ");
        int number2=sc.nextInt();


        while (number2>10){
            number2=number2/10;
        }

        System.out.println("Your 1st digit is : "+number2);

    }
}
