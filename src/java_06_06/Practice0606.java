package java_06_06;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Practice0606 {
    public static void main(String[] args) {

//       Take Character As a user Input

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your String 1 :");
        String var1=sc.nextLine();

        System.out.println("Enter your String 2 :");
        String var2=sc.next();

        sc.nextLine();

        System.out.println("Enter A Character : ");
        char var3=sc.next().charAt(0); // this line for taking User Input Character


        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

//        (1) Check A number is even or odd
//        even: 2,4,6,8,64
//        odd: 1,3,7,9,17,77

        System.out.println("Enter A number :");
        int num=sc.nextInt();

        if (num==0){
            System.out.println("This is neither even nor odd");
        }
        else if (num%2==0){
            System.out.println("This is an Even Number");
        }
        else {
            System.out.println("This is odd Number");
        }

//        Check a Character is Vowel or not
//        Vowels= a,e,i,o,u

        System.out.println("Enter your Alphabet : ");
        char character=sc.next().charAt(0);

        if (character=='a' || character=='e' || character=='i' || character=='o' || character=='u' ||
                character=='A' || character=='E' || character=='I' || character=='O' || character=='U'){
            System.out.println("This is Vowel");
        }
        else {
            System.out.println("This is Consonant");
        }

//        Check A year is leap year OR not

        System.out.println("Enter Your Year :");
        int year=sc.nextInt();

        if (year%4 == 0 && year%100 != 0){
            System.out.println("This is leap year");
        }
        else if(year%400==0){
            System.out.println("This is leap year");
        }
        else {
            System.out.println("This is Not a Leap Year");
        }

//        or

        Year year1=Year.of(year);
        Year year2=Year.now();


//        LocalDate ld=LocalDate.now();
//        System.out.println(ld);

        System.out.println(year2);

        if (year1.isLeap()){
            System.out.println("Leap year");
        }
        else {
            System.out.println("not leap year");
        }


    }
}
