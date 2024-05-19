package java_19_05;

import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

//        Check A number belongs in range between 20 and 40 or not

        System.out.println("Enter Your Number : ");
        int numberOne= sc.nextInt();

        if (numberOne >= 20 && numberOne <= 40){
            System.out.println("It lies between 20 and 40 ");
        }
        else {
            System.out.println("It does not lie between 20 and 40 ");
        }
    }
}
