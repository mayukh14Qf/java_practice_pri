package java_19_09;

import java.util.Scanner;

public class Functions {

    // Here We Make our Functions

    public static int fact(int a){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }


    // Functions syntax

    /*

    public static (return type .. int,float,char,String,void)  (Function Name) ()
    {
    Statement 1;
    statement 3.
    }


     */


    public static void name(String s){
        System.out.println("Your Name is "+s);
    }

    public  static void name(String s,int a){
        System.out.println("Your Name is "+s);
        System.out.println("Your Age is "+a);
    }


    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

        // Strong Number
        // 145 == 1! + 4! + 5! = 1+24+120=145

        System.out.println("Enter Your Number : ");
        int number= sc.nextInt(); // 145
        int carbonOne=number; //145
//        int carbonTwo=number;

        int strong =0; //120+24+1
        while (carbonOne>0){ //1 > 0
            int digitFact=fact(carbonOne%10);
            strong=strong+(digitFact); // 120 24 1
            carbonOne=carbonOne/10;
        }

        System.out.println(strong);

        if (number==strong){
            System.out.println("It is A Strong Number ");
        }
        else {
            System.out.println("It is Not A Strong Number");
        }

        /*
        WE FOLLOW THE CONCEPT OF DRY (DO NOT REPEAT YOURSELF)
         */

        System.out.println(fact(6));

        name("mayukhjit");
        name("rimpa");
        name("tanisha");
        name("abc",45);
//        name("xyz",90,7); (Definition is not available)

    }
}
