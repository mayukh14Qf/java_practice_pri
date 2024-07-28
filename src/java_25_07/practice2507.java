package java_25_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice2507 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        List<Integer> prime1= new ArrayList<>();


    // Twin Prime

        for(int i=1; i<=100 ;i++){
            int count=0;
            for (int j=1; j<=i ;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                int count2=0;
                for (int j=1; j<=i+2 ;j++){
                    if ((i+2)%j==0){
                        count2++;
                    }
                }
                if (count2==2){
                    System.out.println("( "+i+", "+(i+2)+" )");
                }
            }

        }

//        for (int i=0; i<prime1.size();i++) {
//            if (( i < prime1.size() - 1 && prime1.get(i + 1) - prime1.get(i) == 2) ){
//                System.out.println("( " +prime1.get(i)+" , "+prime1.get(i+1)+" )");
//            }
//        }




        // Prime and palindrome


        System.out.println("Enter A Number : ");
        int num1= sc.nextInt();

        // prime check
        int count=0;
        for (int i=1; i<= num1 ; i++){
            if (num1%i==0){
                count++;
            }
        }
         // Palindrome check
        int temp=num1;
        int rev=0;
        while (temp>0){
            rev=(rev*10)+(temp%10);
            temp=temp/10;
        }

        if ((rev==num1) && (count==2)){
            System.out.println("The number is palindrome and Prime ");
        }
        else if (rev==num1){
            System.out.println("The is only palindrome");
        }

        else if (count ==2){
            System.out.println("The number is only prime");
        }
        else {
            System.out.println("neither palindrome nor prime");
        }


    }
}
