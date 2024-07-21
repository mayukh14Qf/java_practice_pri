package java_21_07;

import java.util.Scanner;

public class loop9 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        // Perfect Number

        System.out.println("Enter Your Number : ");
        int numberOne= sc.nextInt();

        int sumOfFactors=0;

        for (int i=1; i<numberOne ;i++){
            if (numberOne % i ==0){
                sumOfFactors=sumOfFactors+i;
            }
        }
        System.out.println("Sum of the factors is : "+sumOfFactors);

        if (sumOfFactors == numberOne) {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }

        // Armstrong Number

        System.out.println("Enter Your Number : ");
        int numberTwo= sc.nextInt();

        int temp1=numberTwo; // copy of numberTwo
        int count=0;
        while (temp1>0){ // this loop will be counting the number of digits
            count++;
            temp1=temp1/10;
        }
        System.out.println("Your Number of digits present are : "+count);

        int temp2=numberTwo;
        int arm =0;
        while (temp2>0){

            arm=arm+(int)Math.pow(temp2%10,count);
            temp2=temp2/10;
        }

        System.out.println("After operation the answer is : "+arm);

        if (arm==numberTwo){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an armstrong number");
        }

    }
}
