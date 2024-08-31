package java_31_08;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        /*

        *
        * *
        * * *
        * * * *
        * * * * *

         */


        System.out.println("Enter The Number Of Rows : ");
        int rows1=sc.nextInt(); //6

        // nesting ( whenever we use a loop inside another loop)

        for (int i=1;i<=rows1;i++){ // my outer loop will just traverse each row one by one.
            for (int j=1;j<=i;j++){ // inner loop will print the desired number of elements in a particular row
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
