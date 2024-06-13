package java_13_06;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A Number : ");
        int number1=sc.nextInt();

//        Switch Case is kinda enhance version of (==) of if-else

        switch (number1){
            case 10:
                System.out.println("Number is 10");
                break;
            case 20:
                System.out.println("Number is 20");
                break;
            case 30:
                System.out.println("Number is 30");
                break;
            case 45:
                System.out.println("Number is 45");
                break;
            default:
                System.out.println("Number does not exist among those directed values");
                break;
        }

//        Check Vowel or not , by using switch case

        System.out.println("Enter your Character :");
        char char1=sc.next().charAt(0);

        switch (char1){
//            Merging Switch case Together for same output statement
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("This is not Vowel");
                break;
        }

    }
}
