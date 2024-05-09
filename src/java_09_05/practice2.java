package java_09_05;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
//        TO FIND THE SIMPLE INTEREST

        Scanner mayukh= new Scanner(System.in);

        System.out.println("Enter your Principle(p) : ");
        double p=mayukh.nextDouble();

        System.out.println("Enter Your Rate of Interest (r) : ");
        double r=mayukh.nextDouble();

        System.out.println("Enter your Time (t) : ");
        double t= mayukh.nextDouble();

        double simpleInterest=(p*r*t)/100;

        System.out.println("Your Simple Interest is :" );
        System.out.println(simpleInterest);



//        TO PRINT NAME, COLLEGE AND AGE IN SINGLE LINE
        mayukh.nextLine();
        System.out.println("Enter Your Name :");
        String name=mayukh.nextLine();

        System.out.println("Enter Your College Name :");
        String collegeName=mayukh.nextLine();


        System.out.println("Enter your age :");
        int age=mayukh.nextInt();

   /*     System.out.print(name+" "); // + denotes here for String is " CONCATENATION"
        System.out.print(collegeName+" ");
        System.out.print(age); */

        System.out.println(name+" "+collegeName+" "+age);
        System.out.println("2"+"3");

    }
}
