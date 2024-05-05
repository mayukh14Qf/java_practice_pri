package java_05_05;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner practice=new Scanner(System.in);

//      (1)PRINT AN INTEGER IN USER INPUT FORMAT

        System.out.println("Enter an Integer :");
        int myInteger = practice.nextInt(); // to take an integer input from user

        System.out.println(myInteger);

//       (2) PRINT ADD OF 2 INTEGERS

        System.out.println("Enter your 1st Number :");
        int num1=practice.nextInt();

        System.out.println("Enter 2nd number : ");
        int num2=practice.nextInt();

        int add= num1+num2;

        System.out.println(add);

//     (3) MULTIPLICATION OF 2 FLOATING POINT INTEGER

        System.out.println("Enter your 1st Digit :");
        float digit1=practice.nextFloat();

        System.out.println("Enter your 2nd Digit :");
        float digit2=practice.nextFloat();

        float multi=digit1*digit2;

        System.out.println(multi);

//      (4) find out quotient and remainder

        System.out.println("Enter your Dividend :");
        int dividend=practice.nextInt();

        System.out.println("Enter your Divisor :");
        int divisor=practice.nextInt();

        int quotient=dividend/divisor;
        int remainder=dividend%divisor;

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
