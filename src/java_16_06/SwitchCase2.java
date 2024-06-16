package java_16_06;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {

//        User input (1-7), print respective day(1->Monday, 2-> tuesday and so on)

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Number (1-7) : ");
        int day=sc.nextInt();


        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }


//        Difference Between Print() and println()

        System.out.println("Hi");
        System.out.println("Hello");
        System.out.print("what's up?");
        System.out.println("java");
        System.out.print("you are awesome ");
        System.out.print("hi again");

/*      Whenever We are using println()
        it will move our cursor in the next line after printing it's own value


        Whenever We are using print()
        it will not move our cursor in the next line ,
        it will stop right after it's printed value
*/

    }
}
