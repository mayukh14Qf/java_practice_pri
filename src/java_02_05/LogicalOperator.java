package java_02_05;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
//        LOGICAL AND ( && )
//        If One condition is False then whole answer will be false

        System.out.println((5!=6) && (6>9));
        System.out.println((4==4) && (5>0) &&(0==0));

//        LOGICAL OR
//        If One condition is True then whole answer will be True
        System.out.println((5!=6) || (6>9));
        System.out.println((4==4) || (5>0) || (0==0));

//        LOGICAL NOT

        System.out.println(!(5!=5));
        System.out.println(!(10>109));
// EQUATION IN JAVA , IN PRESENCE OF SAME OPERATORS
        System.out.println(5/10*2+11*4-1);
        double a=12;
        double b=14;
        System.out.println(a/b);
        System.out.println(5/10);
        System.out.println(10/20+2*6/3+5);

//        TAKE 2 NUMBERS FROM USER AND PERFORM ARITHMETIC OPERATION

        Scanner mayukh= new Scanner(System.in);

        System.out.println("Enter your 1st number :");
        double num1=mayukh.nextDouble();

        System.out.println("Enter your 2nd number :");
        double num2=mayukh.nextDouble();

        System.out.println("Enter your 3rd number");
        int num4=mayukh.nextInt();

        System.out.println("addition is "+(num1+num2));
        System.out.println("Subtraction is "+(num1-num2));
        System.out.println("Multiplication is "+(num1*num2*num4));
        System.out.println("Division is "+(num1/num2));


    }
}
