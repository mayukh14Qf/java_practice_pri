package java_14_04;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int num1=101;
        System.out.println(num1);

        int num2;  // Declare
        num2=10; //Assign
        System.out.println(num2);

        // user input

        Scanner sc= new Scanner(System.in);

        System.out.println("enter your number");
        int num3=sc.nextInt();

        System.out.println("enter a byte number");
        byte num4=sc.nextByte();

        System.out.println("give a float number");
        float num5=sc.nextFloat();

        System.out.println("enter a double");
        double num6=sc.nextDouble();

        System.out.println("write a boolean");
        boolean check1=sc.nextBoolean();

        sc.nextLine();

        System.out.println("enter a sentence");
        String s1=sc.nextLine();

        System.out.println("your Outputs are :");

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(check1);
        System.out.println(s1);
    }
}
