package java_08_09;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        /*

        1
        1 0
        1 0 1
        1 0 1 0
        1 0 1 0 1

         */

        System.out.println("Enter The Number Of Rows : ");
        int rows=sc.nextInt();

        for (int i=1; i<=rows;i++){
            for (int j=1; j<=i;j++){
                if (j%2==0){
                    System.out.print(0+" ");
                }
                else {
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }



        // FIND THE SUM OF EACH ELEMENT OF A GIVEN 2-D ARRAY

        int [][] arr={ {10,23}  , {34,5,6}  , {2,8}   };

        int sum=0;

        for (int i=0;i<= arr.length-1;i++){
            for (int j=0;j<=arr[i].length-1;j++){
                sum=sum+arr[i][j];
            }
        }

        System.out.println("Sum of the Elements is : "+sum);



        //FIND FIRST ALPHABET OF EVERY WORD IN A SINGLE SENTENCE

        // input : My name is Mayukhjit Chakraborty
        // output : M n i M C

        System.out.println("Enter Your String : ");
        String s= sc.nextLine();  //My name is Mayukhjit

        String [] arrayString=s.split(" "); //[My, Name, is, Mayukhjit]

//        System.out.println(Arrays.toString(arrayString));


        for (int i=0;i<=arrayString.length-1;i++){
            System.out.print(arrayString[i].charAt(0)+" ");
        }

    }
}
