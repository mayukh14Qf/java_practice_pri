package java_09_06;

import java.util.Scanner;

public class java0906 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
//        1)NUMBER (USER INPUT) AND
//        CHECK THE LAST DIGIT OF THE NUMBER IS EVEN OR NOT
//        EG: 2389 -> 9 -> ODD
        System.out.println("Enter Your Number : ");
        int number= sc.nextInt();

        int lastDigit= number%10;
        System.out.println("Your Last Digit Of the Number is "+lastDigit);

        if (number%2==0){
            System.out.println("Your digit is Even ");
        }
        else {
            System.out.println("Your digit is odd ");
        }


//        1-9 , this is applicable, the number which is less than 10 greater than zero

        System.out.println(5%10);  // 5
        System.out.println(5/10); // 0



//          2)STUDENT -> BENGALI, ENGLISH, COMPUTER, MATHS (USER INPUT) AND
//          FIND OUT THE AVERAGE OF THE MARKS

        System.out.println("Enter Marks for Bengali : ");
        double bengali=sc.nextDouble();

        System.out.println("Enter Marks for English : ");
        double english=sc.nextDouble();

        System.out.println("Enter Marks for Computer : ");
        double computer=sc.nextDouble();

        System.out.println("Enter Marks for Mathematics : ");
        double maths= sc.nextDouble();

        double average=(bengali+english+computer+maths)/4;

        System.out.println("Your Average Score is "+average);

//       Make a Simple Calculator by using If else

        System.out.println("Enter Your Arithmetic Operation ");
        System.out.println("Choose 'a' for Addition");
        System.out.println("Choose 's' for Subtraction");
        System.out.println("Choose 'm' for Multiplication");
        System.out.println("Choose 'd' for Division");
        System.out.println("Rules : number 1 > number2");
        char operation=sc.next().charAt(0);

        System.out.println("Enter Your 1st Number : ");
        double num1=sc.nextDouble();

        System.out.println("Enter Your 2nd Number : ");
        double num2=sc.nextDouble();

        if (operation=='a'){
            System.out.println("your addition is "+(num1+num2));
        }
        else if(operation=='s'){
            System.out.println("your Subtraction is "+(num1-num2));
        }

        else if (operation=='m'){

            System.out.println("your Multiplication is "+(num1*num2));
        }

        else if(operation=='d'){
            System.out.println("your division is "+(num1/num2));
        }

        else {
            System.out.println("Please choose among those characters ('a','s','m','d')");
        }

    }
}
