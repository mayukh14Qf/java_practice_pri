package java_19_05;

import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//  (1)    This is the way of using else if in the code

        System.out.println("Enter A Number :");
        int num=sc.nextInt();

        if (num==0){
            System.out.println("It Is Zero");
        }
//        To check Multiple conditions for given Input
        else if(num>0){
            System.out.println("It is Positive");
        }
        else {
            System.out.println("It is Negative");
        }

//  (2)      Grading System

        System.out.println("Enter your Grade : ");
        int grade= sc.nextInt();

        if (grade>=90){
            System.out.println("Your Grade is A+");
        }
        else if (grade>=80 && grade<90){
            System.out.println("Your Grade is A");
        }
        else if (grade>=70 && grade<80){
            System.out.println("Your Grade is B");
        }
        else if (grade>=60 && grade<70){
            System.out.println("Your Grade is C");
        }
        else if (grade>=50 && grade<60){
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Your Grade is F");
        }

    }
}
