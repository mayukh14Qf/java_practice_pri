package java_02_06;

import java.util.Scanner;

public class practice0206 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter A Number within 100 : ");
        int num=sc.nextInt();

        if (num<0){
            System.out.println("This is less than zero");
        }
        else if(num>0 && num<50){
            System.out.println("this in a range of 1-49");
        }
        else {
            System.out.println("this is in a range of 50 -> nth number");
        }

//        (Q) Take two Integer number a,b where (a>b), c=a/b check my c is integer or not

        System.out.println("Your A should be greater than B ");
        System.out.println("Enter Your A : ");
        double a= sc.nextInt();

        System.out.println("Enter Your B: ");
        double b= sc.nextInt();

        if (a%b==0){
            System.out.println("Your answer is an Integer , answer is "+(int)(a/b));
        }
        else {
            System.out.println("Your answer is not an Integer, answer is "+(a/b));
        }

        System.out.println("your 1st String");
        String s1= sc.nextLine();

        System.out.println("Enter your 2nd String");
        String s2= sc.next();

        sc.nextLine();
        System.out.println("Enter your 3rd String");
        char s3= sc.next().charAt(0);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // This is the way of taking user input Character
        System.out.println("Enter your Character");

        char c1=sc.next().charAt(0);

        System.out.println(c1);

        // Check A number is even or odd


        // Check A character is Vowel or not




    }
}
