package java_17_05;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your Attendance : ");
        int attendance=s.nextInt();

//        IF MY CONDITION IS TRUE, THE IF BLOCK WILL BE EXECUTED
        if (attendance>=80){ // It will count true from 80
            System.out.println("You are Eligible");
        }
//        IF MY " IF BLOCK" WAS FALSE, THEN ELSE BLOCK WILL BE EXECUTED
        else {
            System.out.println("You are Not Eligible");
        }

//        Check A number is positive or negative

        System.out.println("Give Me a Number : ");
        int number= s.nextInt();

        if (number>0){
            System.out.println("It is Positive Number");
        }
        else {
            System.out.println("It is Negative number");
        }
//        Else Block Only will be taking its action , when if block condition is false




    }
}
