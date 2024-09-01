package java_01_09;

import java.util.Scanner;

public class patterns2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        /*

        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5

         */

        System.out.println("Enter The Number Of Rows : ");
        int rows5=sc.nextInt(); //5


        for (int i=1;i<=rows5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }



        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */

        System.out.println("Enter The Number Of Rows : ");
        int rows4=sc.nextInt(); //5


        for (int i=1;i<=rows4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }



        /*

        * * 3 4 * *
        * * 3 4 * *
        * * 3 4 * *
        * * 3 4 * *

         */


        System.out.println("Enter Your No of Rows : ");
        int rows3=sc.nextInt(); //4

        for (int i=1;i<=rows3;i++){
            for (int j=1;j<=6;j++){
                if (j==3 || j==4){
                    System.out.print(j+" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        /*

        * * * * *
        * * * *
        * * *
        * *
        *

         */

        System.out.println("Enter Your No of Rows : ");
        int rows2=sc.nextInt(); //5

        for (int i=1;i<=rows2;i++){
            for (int j=i;j<=rows2;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // or

        for (int i=1;i<=rows2;i++){
            for (int j=rows2;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        // or


        for (int i=0;i<rows2;i++){
            for (int j=1;j<=(rows2-i);j++){
                System.out.print("* ");
            }
            System.out.println();
        }



        /*

        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *

         */


        System.out.println("Enter Your No of Rows : ");
        int rows1=sc.nextInt(); //5

        for (int i=1;i<=rows1;i++){
            for (int j=1;j<=rows1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
