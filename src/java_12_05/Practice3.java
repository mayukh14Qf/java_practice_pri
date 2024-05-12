package java_12_05;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {

//        SWAP 2 NUMBER
//        WITH USING 3RD VARIABLE

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your 1st Number :");
        int a= sc.nextInt();

        System.out.println("Enter Your 2nd Number :");
        int b=sc.nextInt();

        System.out.println("Your 1st number before swapping is "+a);
        System.out.println("Your 2nd number before swapping is "+b);

        int c; // This is the 3rd Variable
        c=a;
        a=b;
        b=c;

        System.out.println("Your 1st number after swapping is "+a);
        System.out.println("Your 2nd number after swapping is "+b);

//        WITHOUT USING 3RD VARIABLE

        System.out.println("Enter your 1st Number :");
        int x= sc.nextInt();

        System.out.println("Enter Your 2nd Number :");
        int y=sc.nextInt();

        System.out.println("Your 1st number before swapping is "+x);
        System.out.println("Your 2nd number before swapping is "+y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("Your 1st number after swapping is "+x);
        System.out.println("Your 2nd number after swapping is "+y);



//        Type Casting

        int x1= 10;
        System.out.println(x1);
        System.out.println((double) x1);

        double x2=12.34;
        System.out.println(x2);
        System.out.println((int) x2);

        char c1='a';
        System.out.println(c1);
        System.out.println((int) c1); // IT WILL CHANGE THE CHAR TO AN INT ACCORDING TO ASCII TABLE
        System.out.println((int) 'd');
        System.out.println((int) '%');

        int x3=66;
        System.out.println(x3);
        System.out.println((char) x3); // ASCII VALUE ACCORDING TO DEFINITION

    }
}
