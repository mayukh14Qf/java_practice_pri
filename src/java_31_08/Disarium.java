package java_31_08;

import java.util.Scanner;

public class Disarium {
    public static void main(String[] args) {
        // Disarium Number (89,135,175)
        // 123 ==> (1^1)+(2^2)+(3^3)
        // 175==>(1^1)+(7^2)+(5^3) ==> 1+49+125 ==>175

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        int number=sc.nextInt(); //175 (Integer)
        int numberCopy=number;

        String NumberInString=String.valueOf(number); // "175"
        int digits=NumberInString.length(); //3


        int disarium=0; //125+49+1==>175
        while (number>0){  // number==>0
            disarium=disarium+(int)Math.pow(number%10,digits);
            digits--;
            number=number/10;
        }

        if (numberCopy==disarium){
            System.out.println("It is Disarium Number ");
        }
        else {
            System.out.println("It is Not Disarium Number ");
        }

    }
}
