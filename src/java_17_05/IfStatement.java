package java_17_05;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
//        1st Example

        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        if (num<10){
            System.out.println("it is me");
        }
        if (num >15){
            System.out.println("it is you");
        }
    }
}
