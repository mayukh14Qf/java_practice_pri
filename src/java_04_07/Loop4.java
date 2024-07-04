package java_04_07;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {

//       print all the factors of a number

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a Number");
        int num1=sc.nextInt();

        for (int i=1; i<=num1;i++){
            if (num1%i==0){
                System.out.println("your factor is "+i);
            }
        }

        // Prime Number


        System.out.println("Enter a Number");
        int num2=sc.nextInt();

        int count=0;

        for (int i=1; i<=num2;i++){
            if (num2%i==0){
                System.out.println("your factor is " + i);
                count=count+1;
            }
        }

        System.out.println("Your number of factors are :" + count);

        if (count==2){
            System.out.println("Your number is prime");
        }
        else {
            System.out.println("It is a composite number");
        }
    }
}
