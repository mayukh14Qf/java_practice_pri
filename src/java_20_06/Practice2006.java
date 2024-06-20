package java_20_06;

import java.util.Scanner;

public class Practice2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      Need to check whether a character is alphabet or not
        System.out.println("Enter a Character : ");
        char var=sc.next().charAt(0);

        if ((var>='a' && var<='z') || (var>='A' && var<='Z')){
            System.out.println("This is An Alphabet ");
        }
        else {
            System.out.println("This is not alphabet");
        }

    }
}
