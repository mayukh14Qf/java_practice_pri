package Java_04_04;

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        System.out.println("hello.");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your range : ");
        int range=sc.nextInt();

        int a=0;
        int b=1;
        int sum;
        int total=a+b;
        System.out.print(a+" "+b+" ");
        for (int i=3; i<=range; i++){
            sum=a+b;
            total=total+sum;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
        System.out.println();
        System.out.println(total);

    }
}
